package com.kundan.Array.prog1;

import java.util.Arrays;

public class ReverseAnArray2 {
    public static void main(String[] args) {
        int [] array={7, 8, 9, 10, 11};
        for (int i =array.length-1;i>=0;i--){
            System.out.println(array[i]);
        }

        int [] array2=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[array.length-1-i]=array[i];
        }

        System.out.println(Arrays.toString(array2));


    }
}
