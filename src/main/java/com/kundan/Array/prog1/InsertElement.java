package com.kundan.Array.prog1;

public class InsertElement {
public static void main(String[] args) {
	int arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };
	int element= 99;
	int index=2;
	
	int size=arr.length;
	
	if (size>=index) {	
		arr[index]=element;
		System.out.println(element+" placed at index "+index);
	}
	else {
		System.out.println("Array size is "+size+" which is less than "+index);
	}
	
	
}
}
