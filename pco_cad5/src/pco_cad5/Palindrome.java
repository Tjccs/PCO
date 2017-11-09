package pco_cad5;

public class Palindrome {
	
	static int palin = 0;
	static int stri = 0;
	static boolean isPalindrome(String s) {
		stri += 1;
		String a = new StringBuffer(s).reverse().toString();
		if (a.equals(s)) {
			palin += 1;
			return true;
		
		}else {
			return false;
		}
		
	
	}
	public int palAndStrings() {
		return palin;
	}
}
