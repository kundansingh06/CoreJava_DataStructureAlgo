package com.kundan.Array.countduplicatesElementInArrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates_StreamFilterAndCollectionsFrequency {
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

        // 2. get unique elements after removing duplicates
        Set<String> distinctCompanies = Arrays.stream(companies).collect(Collectors.toSet());

        // 2.2 print unique elements
        System.out.println("\n2. Unique elements in String[] array : \n");
        distinctCompanies.forEach(System.out::println);

        // 2.3 Unique element count
        System.out.println("\nNumber of Unique elements = " + distinctCompanies.size());

        // 3. get duplicate elements
        Set<String> duplicateCompanies = Arrays.stream(companies)
                .filter(company -> Collections.frequency(Arrays.asList(companies), company) > 1)
                .collect(Collectors.toSet());

        // 3.1 print duplicate elements
        System.out.println("\n3. Duplicate elements in String[] array : \n");
        duplicateCompanies.forEach(System.out::println);

        // 3.2 Duplicate element count
        System.out.println("\nNumber of Duplicate elements = " + duplicateCompanies.size());
    }
}
