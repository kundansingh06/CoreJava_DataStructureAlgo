package com.kundan.Array.countduplicatesElementInArrays;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
public class FindDuplicates_StreamFilterAndSetAddMethod {
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

        // 2. create Set object to store unique elements
        Set<String> uniqueCompanies = new HashSet<>();

        // 3. get duplicate elements
        Set<String> duplicateCompanies = Arrays.stream(companies)
                .filter(company -> !uniqueCompanies.add(company))
                .collect(Collectors.toSet());

        // 2.1 print unique elements
        System.out.println("\n2. Unique elements in String[] array : \n");
        uniqueCompanies.forEach(System.out::println);

        // 2.2 Unique element count
        System.out.println("\nNumber of Unique elements = " + uniqueCompanies.size());

        // 3.1 print duplicate elements
        System.out.println("\n3. Duplicate elements in String[] array : \n");
        duplicateCompanies.forEach(System.out::println);

        // 3.2 Duplicate element count
        System.out.println("\nNumber of Duplicate elements = " + duplicateCompanies.size());
    }
}

