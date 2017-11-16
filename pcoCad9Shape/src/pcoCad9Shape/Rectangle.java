package pcoCad9Shape;

class Rectangle extends Shape {
	
	Rectangle(double a, double b) {
		super(a, b);
	}

	// override area for rectangle
	double area() {
		System.out.println("Inside Area for Rectangle.");
		return height * width;
	}
}
