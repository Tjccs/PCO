package pco.cad1;

import java.util.ArrayList;
import java.util.List;

public class PrintOddNumbersTo100 {
	
	public List<Integer> PrintNumb() {
		List<Integer> myList = new ArrayList<Integer>();
		for(int i = 1; i < 100; i++) {
			myList.add(i);
		}
		return myList;
	}
}
