package main.designPatterns;

public class C_BuilderPattern {
    //creation of complex object
    public static void main(String[] args) {
        Person p=new PersonBuilder().setage(22).setName("Asdf").build();
    }
}


class PersonBuilder{
    Person p;
    PersonBuilder(){
        p=new Person();
    }
    Person build(){// this is the main method
        return p;
    }
    PersonBuilder setage(int age){
        p.age=age;
        return this;
    }

    PersonBuilder setName(String name){
        p.name=name; //setters can be userd
        return this;
    }

}

class Person{ //setters can be used
    int age;
    int height;
    String name;
    String school;
    String sirname;

}
