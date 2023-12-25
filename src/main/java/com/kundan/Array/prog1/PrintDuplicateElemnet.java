package com.kundan.Array.prog1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateElemnet {
	public static void main(String[] args) {

		
		Integer[] arr = new Integer[] { 1, 4, 2, 7, 8, 8, 3, 7, 3, 6, 2 };
		
		//using for loop
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					//System.out.println(arr[j]);
				}
			}
		}

		//using  Arrays.asList(arr);
		List asList = Arrays.asList(arr);
		Set<Integer> mySet = new HashSet<Integer>(asList);
		for (Integer s : mySet) {
			//System.out.println(s + " " + Collections.frequency(asList, s));
			if (Collections.frequency(asList, s) > 1) {
				System.out.println(s);	
			}
		}
		
		//Using HashMap
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			// System.out.println(entry.getKey() + " " + entry.getValue());
			if (entry.getValue() >= 2) {
				System.out.print(entry.getKey() + " ");
			}
		}
		
		
	}
}
