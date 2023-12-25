package com.kundan.frequncy_Count;

import java.util.HashMap;
import java.util.Map.Entry;

public class Frequency_UsingHashMap {
	public static void main(String[] args) {

		int[] arr2 = {10, 20, 20, 10, 10, 20, 5, 20};

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : arr2) {

			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}

		}
		System.out.println(map);
		
		for (Entry<Integer, Integer> entry : map.entrySet()){
			if (entry.getValue()>2) {
				 System.out.println(entry.getKey() + " " + entry.getValue());
			}
        }
		
		
	}
}
