package com.kundan.Array.prog1;
import java.util.Arrays;
import java.util.Iterator;
public class MultipleWayPrintArray {
	public static void main(String[] args) {
		Integer[] arr = { 4, 8, 15, 16, 23, 42 };
		System.out.println(arr);// [I@7852e922

		//Java for loop
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}

        //Java for-each loop
		for (int i : arr) {
			System.out.print(i+",");
		}

        //Java Arrays.toString() method
		System.out.println(Arrays.toString(arr));


		//Java Arrays.asList() method
		System.out.println(Arrays.asList(arr));




		//Java Iterator Interface
		Iterator<Integer> itr = Arrays.asList(arr).iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+",");
		}

		// count variable
		int temp = 0;
		// iterating using while loop
		while(temp < arr.length) {
			// printing values
			System.out.println(arr[temp]);
			// increment count value by 1
			temp++;
		}

		// java8 Stream API Lambda expression
		Arrays.stream(arr).forEach(num -> System.out.println(num));

		//Java8 Stream API Method reference
		Arrays.stream(arr).forEach(System.out::println);

		//Java8 Stream API iterator
		Iterator it = Arrays.stream(arr).iterator();

	}
}
