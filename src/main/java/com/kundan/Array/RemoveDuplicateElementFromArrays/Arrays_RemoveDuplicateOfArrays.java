package com.kundan.Array.RemoveDuplicateElementFromArrays;
import java.util.Arrays;
public class Arrays_RemoveDuplicateOfArrays {
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
        // get size of the Arrays using length property
        int sizeOfArrays = strArray.length;
        // remove duplicates, using 2 for-loops
        // outer for-loop
        for(int outForLoop = 0; outForLoop < sizeOfArrays; outForLoop++) {
            // inner for-loop
            for(int inForLoop = outForLoop + 1;
                inForLoop < sizeOfArrays; inForLoop++) {
                // check whether, it already contains this element
                if(strArray[outForLoop] == strArray[inForLoop]){
                    // if elements are same, then replace with last item
                    strArray[inForLoop] = strArray[sizeOfArrays-1];
                    // at the same time, decrement size value by 1
                    sizeOfArrays--;
                    // also decrement inner for-loop
                    inForLoop--;
                }
            }
        }
        // create new String[] to copy unique elements
        String[] uniqueStrArrays = Arrays.copyOf(strArray, sizeOfArrays);
        // Iterating using enhanced for-loop
        System.out.println("\n\nUnique elements:\n");
        for(String str : uniqueStrArrays) {
            System.out.println(str);
        }
    }
}