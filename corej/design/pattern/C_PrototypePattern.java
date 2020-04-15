package main.designPatterns;

class C_PrototypePatern {

    public static void main(String[] args) {
        MachineImage linux=new MachineImage("Linux","x86");
        MachineImage windows=new MachineImage("windows","x86");
        MachineImage newLinux=linux.clone();
    }
}

class MachineImage implements Cloneable{
    String os;      String type;
    MachineImage(String os,String type)     {this.os=os;     this.type=type; }
    @Override   public MachineImage clone()     { return new MachineImage(os,type);}
}
