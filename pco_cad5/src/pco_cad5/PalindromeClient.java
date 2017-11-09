package pco_cad5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PalindromeClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/**
		Scanner s = new Scanner(new File("/home/ALUNOSFC/fc48286/PCO/o_meu_fich"));
		
		
		while (s.hasNextLine()) {
			Scanner s2 = new Scanner(s.nextLine());
			while (s2.hasNext()) {
				String s3 = s2.next();
				// System.out.println(Palindrome.isPalindrome(s3));
			}
			
		
		}
		System.out.println("Strings = " + Palindrome.stri);
		System.out.println("Palindromes = " + Palindrome.palin);
	}
	**/
	BufferedReader reader = new BufferedReader(new FileReader("/home/ALUNOSFC/fc48286/PCO/o_meu_fich"));
	System.out.println(FicheiroCarac.numLines(reader));
	
	}
}