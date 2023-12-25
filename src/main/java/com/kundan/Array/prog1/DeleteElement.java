package com.kundan.Array.prog1;

import java.util.Arrays;

public class DeleteElement {
	public static void main(String[] args) {
	int arr[] = { 100, 200, 300, 400, 5,6,7,8 };
	int element= 400;
	int index=2;
	
	if (arr==null || index < 0 || index >= arr.length) {
		System.out.println("not possible");
	}
	int[] result = new int[arr.length - 1];
	
	for (int i = 0; i < index; i++) {
        result[i] = arr[i];
    }
	for (int i = index; i < result.length; i++) {
        result[i] = arr[i + 1];
    }
	System.out.println(Arrays.toString(result));
	
}}
