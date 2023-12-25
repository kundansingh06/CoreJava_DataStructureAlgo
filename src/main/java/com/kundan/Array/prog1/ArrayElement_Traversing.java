package com.kundan.Array.prog1;

import java.util.Arrays;

public class ArrayElement_Traversing {
	public static void main(String[] args) {
		int[] myIntArray1 = new int[3];
		int[] arr2 = { 1, 2, 3 };
		int[] myIntArray3 = new int[] { 1, 2, 3 };

		for (int i = 0; i < arr2.length; i++) { // length is the property of the array
			System.out.print(arr2[i]+" ");
		}

		for (Integer i : arr2) {
			System.out.println(i+" ");
		}
		
		System.out.println(Arrays.toString(arr2));  
		
	
 int i=0;
 while(i<arr2.length) {
	 System.out.println(arr2[i]+" ");
	 i++;
	 
 }
	}
}
