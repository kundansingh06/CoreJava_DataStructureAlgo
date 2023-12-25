package com.kundan.number;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n = 121, num, r, rev = 0;
		num = n;
		while (num > 0) {
			r = num % 10;
			rev = (rev * 10) + r;
			num = num / 10;
			System.out.println(r+"-"+rev+"-"+num);
		}
		if (n == rev) {
			System.out.println("Palindrome Number"+rev);
		} else {
			System.out.println("Not Palindrome Number");
		}
		
		
		int num2=121;
		int reverse=0, element, remainder; 
	    element = num2;
	    for(reverse=0;num2>0;num2/=10){
	      remainder= num2 % 10;
	      reverse = (reverse * 10) + remainder;
	    }
	    if (element == reverse){
	      System.out.println("Yes, it is palindrome");
	    }
	    else{
	      System.out.println("No, it is not palindrome");
	    }

	}

}
