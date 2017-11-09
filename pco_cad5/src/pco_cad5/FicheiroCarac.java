package pco_cad5;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class FicheiroCarac {
	
	static int numLines(BufferedReader f) throws IOException {
		int lines = 0;
		int palavras = 0;
		while (f.readLine() != null) { 
			lines++;
			String word = f.next();
		
		}
		
		f.close();
		
		return lines;
	
	}
}
