package com.kundan.Array.RemoveDuplicateElementFromArrays;

import java.util.Arrays;

public class Java8Streams_RemoveDuplicateOfArrays {
    public static void main(String[] args) {
        // initialize an Arrays with duplicate values
        String[] strArray = {
                "Sun",
                "Apple",
                "JBoss",
                "Whatsup",
                "Apple", // duplicate
                "BEA Weblogic",
                "JBoss" // duplicate
        };
        // invoke removeDuplicatesFromArray() with above initialized Arrays
        removeDuplicatesFromArray(strArray);
    }

    public static void removeDuplicatesFromArray(String[] strArray) {

        // Iterating original Arrays using enhanced for-loop
        System.out.println("Original Arrays with duplicates:\n");
        for(String str : strArray) {
            System.out.println(str);
        }

        // convert to unique/distinct Arrays using Java 8 Streams class
        Object[] uniqueArrays = Arrays.stream(strArray).distinct().toArray();

        // Iterating unique Arrays using enhanced for-loop
        System.out.println("\n\nUnique elements:\n");

        for(Object obj : uniqueArrays) {
            System.out.println(obj.toString());
        }
    }
}
