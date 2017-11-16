package pcoCad9Shape;

public class Shape {
	
	double height;
	double width;
	
	Shape(double a, double b) {
		height = a;
		width = b;
	}
	
	double area() {
		System.out.println("Area for Figure is undefined.");
		return 0;
	}
}

