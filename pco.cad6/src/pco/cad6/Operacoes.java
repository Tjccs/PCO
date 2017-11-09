package pco.cad6;

public class Operacoes {
	
	int totalMaiores(int[] inteiros, int n) {
		int count = 0;
		for (int elem : inteiros) {
			if (elem > n) {
				count += 1;
			}
		}
	return count;
	}

	int soma(int[] inteiros, int n) {
		int count = 0;
		for (int elem : inteiros) {
			if (elem > n) {
				count += elem;
		}
		
		}
		return count;
	}

	double media(int[] inteiros, int n) {
	
		return totalMaiores(inteiros, n)/soma(inteiros, n);
	}


}
