package com.kundan.Array.prog1;
import java.util.*;
public class ReverseTheArray {
    public static void main(String[] args) {
        int [] inputArray = {1, 2, 3, 4, 5};
        System.out.println("Input Array :" + Arrays.toString(inputArray));

        int [] reverseArrayUsingTmp = reverseArrayUsingTmp(inputArray);
        System.out.println("reverseArrayUsingTmp:" + Arrays.toString(reverseArrayUsingTmp));

        reverseArray(inputArray);

        //reverseArrayCollections(inputArray);


    }

    public static int[] reverseArrayUsingTmp(int[] array) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        while(startIndex < endIndex) {
            int temp = array[endIndex];
            array[endIndex] = array[startIndex];
            array[startIndex] = temp;
            startIndex++;
            endIndex--;
        }
        return array;
    }
    
    public static void reverseArray(int[] inputArray) {
        for (int left = 0, right = inputArray.length - 1; left < right; left++, right--) {
            int temp = inputArray[left];
            inputArray[left]  = inputArray[right];
            inputArray[right] = temp;
        }
        System.out.print("Reverse Array :");
        for(int val : inputArray)
            System.out.print(" "+val);
    }

    public static void reverseArrayCollections(Integer[] inputArray) {
        List<Integer> list = Arrays.asList(inputArray);
        Collections.reverse(list);
        System.out.print("Reverse Array :");
        for(Integer val : list)
            System.out.print(" "+val);
    }



}

