package com.kundan.Array.RemoveDuplicateElementFromArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListAndSet_RemoveDuplicateOfArrays {
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

        // convert Arrays into List
        List<String> lst = Arrays.asList(strArray);
        // again convert List into Set, for removing duplicates
        // using inter-conversion constructor
        Set<String> set = new HashSet<String>(lst);
        // create new String[] with no. of elements inside Set
        String[] uniqueArr = new String[set.size()];
        // convert back Set into Arrays
        set.toArray(uniqueArr);
        // Iterating using enhanced for-loop
        System.out.println("\n\nUnique elements:\n");
        for(String uStr : uniqueArr) {
            System.out.println(uStr);
        }
    }
}

