package com.kundan.Array.countduplicatesElementInArrays;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class FindDuplicateCount_CollectorsToMap {
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

        // 2. get duplicate count using Map and Collectors.toMap()
        Map<String, Integer> duplicateCountMap = Arrays.stream(companies)
                .collect(Collectors.toMap(Function.identity(), company -> 1, Math::addExact));

        // 2.1 print unique elements
        System.out.println("\n2. Unique elements in String[] array : \n");
        duplicateCountMap
                .entrySet()
                .stream()
                .forEach(entry -> System.out.println(entry.getKey()));


        // 2.2 print duplicate elements
        System.out.println("\n3. Duplicate elements in String[] array : \n");
        duplicateCountMap
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey()));


        // 2.3 print Map with duplicate count
        System.out.println("\n4. Map Key as Company and Value as its duplicate count : \n");
        duplicateCountMap.forEach((key, value) -> System.out.println("Key : " + key + "\t Count : " + value)
        );
    }
}
