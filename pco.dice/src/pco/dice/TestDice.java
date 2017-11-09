package pco.dice;

public class TestDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice dice = new Dice();
		for(int i = 0; i < 21; i++) {
			System.out.println(dice.roll());
		}
	}

}
