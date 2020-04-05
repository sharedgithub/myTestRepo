package main.designPatterns;

public class B_ChainOfResponsibility {
    //passing resposiblities to chain of object

    public static void main(String[] args) {
        CashDispenser cd=new CashDispenser(2000);
        cd.setDispenser(new CashDispenser(500));
        cd.setDispenser(new CashDispenser(200));
        cd.setDispenser(new CashDispenser(100));
        cd.setDispenser(new CashDispenser(50));
        cd.setDispenser(new CashDispenser(20));

        cd.dispense(45330);
    }
}


class CashDispenser{
    int denomination;

    CashDispenser next;

    CashDispenser(int denomination){
        this.denomination=denomination;
    }

    public void setDispenser(CashDispenser cd){
        if(next==null){
            next=cd;
        }else{
            next.setDispenser(cd);
        }
    }

    public void dispense(int amount){
        int totalNotes=amount/denomination;
        int remainder=amount%denomination;
        System.out.printf("Dispensing %s notes. Total %s notes dispensed %n", denomination,totalNotes);
        next.dispense(remainder);
    }
}

