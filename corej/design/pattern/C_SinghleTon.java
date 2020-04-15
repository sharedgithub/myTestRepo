package main.designPatterns;

class C_Singleton {
}


class Webdriver{
    //private static member
    private static Driver driver;
    //private constructor
    private Webdriver() { }
    //method which creates and return only if null
    public Driver getDriver(){
        if(driver==null){
            return new Driver();
        }else{
            return driver;
        }
    }
}

class Driver{

}
