package pcoCad9AnimalHouse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AnimalHouse<Animal> house = new AnimalHouse<Cat>();
		//AnimalHouse<Dog> house = new AnimalHouse<Animal>();
		//AnimalHouse<?> house = new AnimalHouse<Cat>();*
		//house.setAnimal(new Cat());
		
		AnimalHouse<Cat> house = new AnimalHouse<>();
		AnimalHouse<Dog> house2 = new AnimalHouse<>();
		house2.setAnimal(new Dog());
		house.setAnimal(new Cat());
		ArrayList<AnimalHouse<? extends Animal>> lah = new ArrayList<>();
		lah.add(house);
		lah.add(house2);
	    System.out.println(Outra.animalLegs(lah));
	}
		
	

}
