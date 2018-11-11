package design.pattern;

public class ShapeFactory {
	
	public static Shape getShape(String shape) {

		if(shape.equalsIgnoreCase("Circle")) {
			return new CircleShape();
		}
		if(shape.equalsIgnoreCase("Rectangle")) {
			return new RectangleShape();
		}
		
		return null;
	}

}
