package main.designPatterns;

import java.util.ArrayList;
import java.util.List;

class B_Observer {

    //it is usefull in one to many object mapping where depending on change a subject object has to notified all its
    // observers so that necessary changes can be made

    //ex stock market
    //p
    public static void main(String[] args) {
        NSE nse=new NSE();
        Zerodha zerodha=new Zerodha();
        Zerodha newZerodha=new Zerodha();
        nse.register(zerodha);nse.register(newZerodha);
        nse.setNifty(8000);
        System.out.println(zerodha.getNifty());
        System.out.println(newZerodha.getNifty());
        nse.setNifty(9000);
        System.out.println(newZerodha.getNifty());
        System.out.println(newZerodha.getNifty());
    }
}


interface Observer{
    public void update(int data);
}

interface Subject{
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}

class NSE implements Subject {
    int nifty;
    List<Observer> list;

    public NSE(){
        list=new ArrayList<>();
    }
    @Override
    public void register(Observer o) {
        list.add(o);
    }

    @Override
    public void unregister(Observer o) {
        list.remove(o);
    }

    public void setNifty(int data){
        nifty=data; notifyObservers();// note this step
    }
    @Override
    public void notifyObservers() {
        for(Observer o:list){
            o.update(nifty);
        }
    }
}


class Zerodha implements Observer{
    int nifty;
    public void update(int data){
        nifty=data;
        System.out.println("nifty price updated");
    }
    public int getNifty(){
        return nifty;
    }
}
