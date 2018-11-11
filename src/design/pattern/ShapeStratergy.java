package design.pattern;

public class ShapeStratergy {
	
	private Shape s;
	
	ShapeStratergy(Shape s){
		this.s=s;
	}

	public void draw() {
		s.draw();
	}
}
