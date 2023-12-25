package com.kundan.Array.RemoveDuplicateElementFromArrays;

import java.util.HashSet;
import java.util.Set;

public class Set_RemoveDuplicateOfArrays {
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
        // Iterating using enhanced for-loop
        System.out.println("Original Arrays with duplicates:\n");
        for(String str : strArray) {
            System.out.println(str);
        }
        // initialize an empty HashSet of String type
        Set<String> set = new HashSet<String>();
        // iterate through Arrays to remove duplicates
        for(int index = 0; index < strArray.length; index++) {
            // add elements to HashSet, which doesn't allow duplicates
            set.add(strArray[index]);
        }
        // convert unique Set into Arrays using toArray() method
        strArray = set.toArray(new String[0]);
        // Iterating using enhanced for-loop
        System.out.println("\n\nUnique elements:\n");
        for(String str : strArray) {
            System.out.println(str);
        }
    }
}

