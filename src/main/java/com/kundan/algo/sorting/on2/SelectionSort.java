package com.kundan.algo.sorting.on2;
import java.util.Arrays;
public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = { 64, 25, 12, 22, 11 };
		for (int i = 0; i < arr.length; i++) {
			int min_idx = i;
			for (int j = i + 1; j < arr.length; j++) {
                     //25      64
				if (arr[j] < arr[min_idx])
					min_idx = j;  //min_idx=1
				int temp = arr[min_idx]; //25
				arr[min_idx] = arr[i]; //arr 0=64
				arr[i] = temp; //
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
