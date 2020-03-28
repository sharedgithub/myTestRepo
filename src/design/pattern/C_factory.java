package main.designPatterns;

public class C_Factory {
}


interface IShapeFactory{
    Shape getShape(String shape);
}

class ShapeFactory implements IShapeFactory{
    public Shape getShape(String shape){
        switch (shape){
            case "circle": return new Circle();
            case "rectange": return new Rectangle();
            default:return null;
        }
    }
}


interface Shape{
    void draw();
}


class Circle implements Shape{
    public void draw(){
        System.out.println("Rectange");
    }
}

class Rectangle implements Shape{
    public void draw(){
        System.out.println("Rectange");
    }
}
