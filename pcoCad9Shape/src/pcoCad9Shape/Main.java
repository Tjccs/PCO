package pcoCad9Shape;

public class Main {
	
	public static void main(String args[]) {
		Shape f = new Shape(10, 10);
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		Shape figref;
		figref = r;
		System.out.println("Area is " + figref.area());
		figref = t;
		System.out.println("Area is " + figref.area());
		figref = f;
		System.out.println("Area is " + figref.area());
	
		/**
		 * 1. Overriding
		 * 
		 * 2.
		 * Inside Area for Rectangle.
		 * Area is 45.0
		 * Inside Area for Triangle.
		 * Area is 40.0
		 * Area for Figure is undefined.
		 * Area is 0.0 
		 */
		
	}
}
