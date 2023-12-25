package com.kundan.Array.prog1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge2Array {
	public static void main(String[] args) {
		// array which should be merged
		int src1[] = { 10, 20, 30, 40, 50 };
		int src2[] = { 9, 18, 27, 36, 45 };

		// create new array
		int newArray[] = new int[src1.length + src2.length];
		/*
		 * for (int i = 0; i < newArray.length; i++) { newArray[i] = src1[i]; } for (int
		 * i = 0, j = src1.length; j < (src1.length + src2.length); j++, i++) {
		 * newArray[j] = src2[i]; } System.out.println("Merged Array = " +
		 * Arrays.toString(newArray));
		 */

		//Using Arrays.asList
		List list = new ArrayList(Arrays.asList(src1)); // returns a list view of an array
		list.addAll(Arrays.asList(src2));
		Object[] array = list.toArray();
		System.out.println("Array2 = " + Arrays.toString(array));

		// Using arraycopy
		System.arraycopy(src1, 0, newArray, 0, src1.length);
		System.arraycopy(src2, 0, newArray, src1.length, src2.length);
		System.out.println("Merged Array = " + Arrays.toString(newArray));

	}
}
