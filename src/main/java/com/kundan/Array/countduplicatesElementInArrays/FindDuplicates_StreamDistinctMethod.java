package com.kundan.Array.countduplicatesElementInArrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class FindDuplicates_StreamDistinctMethod {
    public static void main(String[] args) {
        // 1. String[] array
        String[] arr = new String[]{
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
        Arrays.stream(arr).forEach(System.out::println);

        // 2. get unique elements after removing duplicates
        String[] distinctCompanies = Arrays.stream(arr).distinct().toArray(String[]::new);

        // 2.1 print unique elements
        System.out.println("\n2. Unique elements in String[] array : \n");
        Arrays.stream(distinctCompanies).forEach(System.out::println);

        // 2.2 Unique element count
        System.out.println("\nNumber of Unique elements = " + distinctCompanies.length);

        // 3. create List<String> with original String[] array  elements
        List<String> originalCompanyList = new ArrayList<String>(Arrays.asList(arr));

        // 3. get duplicate elements
        for (String distinctCompany : distinctCompanies) {
            originalCompanyList.remove(distinctCompany);
        }

        // 3.1 print duplicate elements
        System.out.println("\n3. Duplicate elements in String[] array : \n");
        originalCompanyList.forEach(System.out::println);

        // 3.2 Duplicate element count
        System.out.println("\nNumber of Duplicate elements = "
                + originalCompanyList.size());
    }
}

