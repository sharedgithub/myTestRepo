package main.designPatterns;

public class S_Facade {
    //to provide simplified interface to the overall functionality of a complex subsystem
    //ex is weddingplanner which arranges everything for you just have to ask to organise stuff
    //its very simple interface nothing too complicated about it..
    public static void main(String[] args) {
        WeddingPlanner wp=new WeddingPlanner();
        wp.Organise();
    }

}

class WeddingPlanner{
    Vehicle vehicle;
    MariageHall mariageHall;
    Food food;
    public void Organise(){
        vehicle=new Vehicle();
        mariageHall=new MariageHall();
        food=new Food();
    }
}

class Vehicle{} class MariageHall{} class Food{}
