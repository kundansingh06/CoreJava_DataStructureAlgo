package com.kundan.Array.RemoveDuplicateElementFromArrays;

import java.util.ArrayList;
import java.util.List;

public class List_RemoveDuplicateOfArrays {
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
            removeDuplicatesFromArray(strArray);
    }

        public static void removeDuplicatesFromArray(String[] strArray) {
            // Iterating using enhanced for-loop
            System.out.println("Original Arrays with duplicates:\n");
            for(String str : strArray) {
                System.out.println(str);
            }
            // initialize an empty ArrayList of String type
            List<String> uniqueList = new ArrayList<String>();

            // remove duplicate iterating through Arrays
            for(int index = 0; index < strArray.length; index++) {
                // check whether list contains duplicate, while iterating
                if(!uniqueList.contains(strArray[index])) {
                    // if it is doesn't contains, then add to unique list
                    uniqueList.add(strArray[index]);
                }
            }

            // convert unique List into Array using toArray() method
            strArray = uniqueList.toArray(new String[0]);

            // Iterating using enhanced for-loop
            System.out.println("\n\nUnique elements:\n");
            for(String str : strArray) {
                System.out.println(str);
            }
        }
    }

