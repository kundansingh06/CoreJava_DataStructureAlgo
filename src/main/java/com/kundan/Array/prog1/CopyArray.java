package com.kundan.Array.prog1;

import java.util.Arrays;

public class CopyArray {
	public static void main(String[] args) {
		// original array
		int arr[] = { 10, 20, 30, 40, 50 };

		// copy array using assignment operator
		int newArr1[] = arr;
		System.out.println("Original Array = " + Arrays.toString(arr));
		System.out.println("Copied Array = " + Arrays.toString(newArr1));

		// copy using loop
		int newArr2[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArr2[i] = arr[i];
		}
		System.out.println("Copied Array = " + Arrays.toString(newArr2));

		// copy array using System.arraycopy
		int newArr3[] = new int[arr.length];
		System.arraycopy(arr, 0, newArr3, 0, arr.length);
		System.out.println("Copied Array = " + Arrays.toString(newArr3));

		// copy array using Arrays.copyOf()
		int[] newArr4 = Arrays.copyOf(arr, arr.length);
		System.out.println("Copied Array = " + Arrays.toString(newArr4));

		// copy array using clone()
		int[] newArr5 = arr.clone();
		System.out.println("Copied Array = " + Arrays.toString(newArr5));

	}
}
