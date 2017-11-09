package pco.dice;

import java.util.Random; 


public class Dice {
	
	private Random number;
	
	public Dice() {
		number = new Random();
		
	}

	public int roll() {
		int number2 = number.nextInt(6) + 1; 
		return number2;
	}
	

}