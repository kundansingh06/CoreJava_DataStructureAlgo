package com.kundan.Array.prog1;

public class Min_max_Element {
	public static void main(String[] args) {
		int[] arr = { 5, 7, 2, 4, 9, 6 };
		int max = arr[0];
		int min = arr[0];

		// do for each array element
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}

			else if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		

	}
}
