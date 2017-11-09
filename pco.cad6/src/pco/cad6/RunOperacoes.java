package pco.cad6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class RunOperacoes {
	/**
	* @param args
	 * @throws Exception 
	*/
	public static void main(String[] args) throws Exception, NumberFormatException {
		Scanner sc = new Scanner(new BufferedReader(new FileReader(args[0])));
		int tamanho = lerTamanhoArray(sc);
		int[] inteiros = lerArrayInteiros(sc,tamanho);
		System.out.println(Arrays.toString(inteiros));
		Operacoes m = new Operacoes();
		m.media(inteiros, n);
		sc.close();
	
	}
		
	public static int lerTamanhoArray(Scanner sc) throws Exception {
		int n = Integer.parseInt(sc.nextLine());
		if (n <= 0) {
			throw new Exception("Tamanho <= 0");
		}
		return n;
	}
	
	/**
	* @throws Exception 
	 * @requires tamanho>0
	*/
	public static int[] lerArrayInteiros(Scanner sc, int tamanho) throws Exception {
		String linha = sc.nextLine();

		String [] nrs = linha.split(" ");
		if (nrs.length != tamanho) {
			throw new Exception("O tamanho indicado não está correcto.");
		}
		int[] inteiros = new int[tamanho];
		for (int i = 0; i < tamanho; i++){
			inteiros[i] = Integer.parseInt(nrs[i]);
			if (inteiros[i] <= 0) {
				throw new Exception("Valor do array é negativo");
			}
		}
		
		return inteiros;
	}
}
