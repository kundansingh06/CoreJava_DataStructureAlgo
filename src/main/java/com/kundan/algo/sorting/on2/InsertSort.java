package com.kundan.algo.sorting.on2;
public class InsertSort {
	public static void insertSort(int array[]) {
		for (int i = 1; i < array.length; i++) {
			int num = array[i];
			int j;
			for (j =i-1; j>=0 ; j--) {
				if (array[j]>num){
					array[j+1]=array[j];
				}
				else{
					break;
				}
			}
			array[j+1]=num;
		}
	}
	static void printArr(int Array[]) {
		for (int i = 0; i < Array.length; i++) {
			System.out.println(Array[i]);
		}
	}
	public static void main(String[] args) {
		int[] arr = { 13, 11, 12, 6, 5 };
		System.out.println("Before method invocation");
		printArr(arr);
		// method invocation
		insertSort(arr);
		System.out.println("After sort method invocation");
		printArr(arr);
	}

}
