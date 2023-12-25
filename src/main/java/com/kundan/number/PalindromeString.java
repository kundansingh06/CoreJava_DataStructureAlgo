package com.kundan.number;

public class PalindromeString {
	public static void main(String[] args) {
		String x = "dad", y = "";
		for (int k = x.length() - 1; k >= 0; k--) {
			y = y + x.charAt(k);
		}
		if (x.equalsIgnoreCase(y)) {
			System.out.println("The string is palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}

	}

	public static boolean PalindromeRecursion(String a) {
		if (a.length() == 0 || a.length() == 1) {
			return true;
		}
		if (a.charAt(0) == a.charAt(a.length() - 1)) {
			return PalindromeRecursion(a.substring(1, a.length() - 1));
		}
		return false;
	}
	
	public static void PalindromeString(String s){
	    String reverse = new StringBuffer(s).reverse().toString();
	    if (s.equals(reverse)){
	      System.out.println("Yes, it is a palindrome");
	    }
	    else{
	      System.out.println("No, it is not a palindrome");
	    }
	}

}
