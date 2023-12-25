package com.kundan.Array.countduplicatesElementInArrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class FindDuplicateCount_MapMergeAndForEach {
    public static void main(String[] args) {
        // 1. String[] array
        String[] companies = new String[]{
                "Meta",
                "Apple",
                "Amazon",
                "Netflix",
                "Meta", // duplicate
                "Google",
                "Apple" // duplicate
        };

        // 1.1 print String[] array to console
        System.out.println("1. Original String[] Array with duplicates : \n");
        Arrays.stream(companies).forEach(System.out::println);

        // 2. create HashMap object
        Map<String, Integer> duplicateCountMap = new HashMap<>();

        // 2.1 iterate and store duplicate count into Map object
        Arrays.stream(companies)
                .forEach(company -> duplicateCountMap.merge(company, 1, (a, b) -> a + b));

        // 2.2 print unique elements
        System.out.println("\n2. Unique elements in String[] array : \n");
        duplicateCountMap
                .entrySet()
                .stream()
                .forEach(entry -> System.out.println(entry.getKey()));

        // 2.3 print duplicate elements
        System.out.println("\n3. Duplicate elements in String[] array : \n");
        duplicateCountMap
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey()));

        // 2.4 print Map with duplicate count
        System.out.println("\n4. Map Key as Company and "
                + "Value as its duplicate count : \n"
                + duplicateCountMap);
    }
}
