package pco.cad1;

public class Euclides {
	static int mdc(int a, int b) {
		while(a != 0 && b != 0) {
			int c = b;
			b = a%b;
			a = c;
		}
		return a+b;
	}
}
