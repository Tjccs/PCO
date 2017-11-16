package pcoCad9Shape;

class Triangle extends Shape {
	
	Triangle(double a, double b) {
		super(a, b);
	}

	// override area for right triangle
	double area() {
		System.out.println("Inside Area for Triangle.");
		return height * width / 2;
	}
}