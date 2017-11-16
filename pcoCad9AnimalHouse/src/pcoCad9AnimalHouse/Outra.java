package pcoCad9AnimalHouse;

import java.util.ArrayList;
import java.util.Set;

public class Outra {
	
	public static int animalLegs(ArrayList<AnimalHouse<? extends Animal>> lista) {
		int c = 0;
		for (AnimalHouse<? extends Animal> h : lista) {
			c += h.getAnimal().getLegs();
		}
		return c;
		
	}

	public static void animalLegs1(ArrayList<AnimalHouse<? extends Animal>> lah) {
		// TODO Auto-generated method stub
		
	}
}
