package com.kundan.frequncy_Count;

public class Frequency2 {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 3, 2, 1 };

		int[] freq = new int[arr.length];

		for (int e : arr) {
			freq[e]++;
		}

		// iterate through the array to print frequencies
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 0) {
				System.out.println(i+" appears times "+freq[i]);
			}
		}
	}

}
