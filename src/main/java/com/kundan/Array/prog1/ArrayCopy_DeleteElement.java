package com.kundan.Array.prog1;
import java.util.Arrays;
public class ArrayCopy_DeleteElement {
	public static void main(String[] args) {
		int[] arr = { 100, 200, 300, 400, 500 };
		int   index = 2;
		int[] anotherArray = new int[arr.length - 1];

		//arraycopy(Object src, int srcPos,   Object dest, int destPos, int length);
		
		// Copy the elements from starting till index from original array to the other array
		System.arraycopy(arr, 0, anotherArray,0, index);
		System.out.println(Arrays.toString(anotherArray));
		
		//Copy the elements from index + 1 till end from original array to the other array
		  System.arraycopy(arr, index + 1, anotherArray, index, arr.length - index - 1);
		  System.out.println(Arrays.toString(anotherArray));
		  
			
	}
}
