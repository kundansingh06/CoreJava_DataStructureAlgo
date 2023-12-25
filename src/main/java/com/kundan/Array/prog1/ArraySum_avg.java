package com.kundan.Array.prog1;

public class ArraySum_avg {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		
	    // calculate the average value
	    int avg = sum/arr.length;
	    System.out.println(avg);
	}
}