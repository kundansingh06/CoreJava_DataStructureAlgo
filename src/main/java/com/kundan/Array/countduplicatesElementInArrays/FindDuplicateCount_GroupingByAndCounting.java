package com.kundan.Array.countduplicatesElementInArrays;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
public class FindDuplicateCount_GroupingByAndCounting {
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


        // 2. get unique elements
        Set<String> distinctCompanies = Arrays
                .stream(companies)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());


        // 2.1 print unique elements
        System.out.println("\n2. Unique elements in String[] array : \n");
        distinctCompanies.forEach(System.out::println);


        // 3. get duplicate elements
        Set<String> duplicateCompanies = Arrays
                .stream(companies)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(c -> 1)))
                .entrySet()
                .stream()
                .filter(company -> company.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());


        // 3.1 print duplicate elements
        System.out.println("\n3. Duplicate elements in String[] array : \n");
        duplicateCompanies.forEach(System.out::println);


        // 4. get duplicate count using Map
        Map<String, Long> duplicateCount = Arrays
                .stream(companies)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        // 4.1 print Map for duplicate count
        System.out.println("\n4. Map Key as Company and Value as its duplicate count : \n");
        duplicateCount.forEach(
                (key, value) -> System.out.println("Key : " + key + "\t Count : " + value)
        );
    }
}
