package com.kundan.number;
public class ReverseNumber {
	public static void main(String[] args) {
		int n=12345, num, r,
        rev = 0;
        num = n;
		while (num > 0){
            r = num % 10;
            rev = (rev * 10) + r;
            num = num / 10;
        }
        System.out.println("Reverce of Number=" + rev);
        
     

	}

}
