package com.kundan.Array.prog1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayContains {
    public static void main(String[] args) {
        String[] vowels = { "A", "I", "E", "O", "U" };

       // using simple iteration over the array elements
        for (String s : vowels) {
            if ("E".equals(s)) {
                System.out.println("E found in the vowels list.");
            }
        }


        boolean u = Arrays.asList(vowels).contains("U");
        boolean x = Arrays.asList(vowels).contains("X");

        if(Arrays.asList(vowels).contains("am")){
            System.out.println("Found");
        }

        boolean contains = Arrays.stream(vowels).anyMatch("O"::equals);
        boolean contains2 = Arrays.stream(vowels).anyMatch("X"::equals);





        System.out.println("Unsorted Array = " + Arrays.toString(vowels));
        Arrays.parallelSort(vowels);
        System.out.println("Sorted Array = " + Arrays.toString(vowels));
        int index = Arrays.binarySearch(vowels, "U");

        if (index < 0) {
            System.out.println("ELEMENT not found in the array");
        } else {
            System.out.println("ELEMENT found in the array: "+ index);
        }




        String[] subset = { "E", "U","W"};
        boolean foundAll = Arrays.asList(vowels).containsAll(Arrays.asList(subset));
        System.out.println("vowels contains all the elements in subset = " + foundAll);


    }
}
