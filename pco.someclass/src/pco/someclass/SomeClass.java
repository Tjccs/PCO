package pco.someclass;

public class SomeClass {
	private int fieldA;
	int fieldB;
	
	public SomeClass() {
		setA(0);
		setB(0);
	}
	
	SomeClass(int a,int b) {
		setA(a);
		setB(b);
	}
	
	private int getA() {
		return fieldA;
	}	
	public int getB() {
		return fieldB;
	}
		
	void setA(int a) {
		fieldA = a;
	}
		
	private void setB(int b) {
		fieldB = b;
	}
	
}
