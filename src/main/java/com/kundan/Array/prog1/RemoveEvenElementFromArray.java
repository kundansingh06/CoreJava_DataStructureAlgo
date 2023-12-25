package com.kundan.Array.prog1;

import java.util.Arrays;

public class RemoveEvenElementFromArray {
    public static void main(String[] args) {
        int [] arr={2,3,5,8,10,11,12};
        removeEvenElement(arr);
    }

    private static void removeEvenElement(int[] arr) {

        int evenCount=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]%2==0){
                evenCount++;
            }
        }

        System.out.println(evenCount);
        int [] arr2 =new int[evenCount];

        int dx=0;

        for (int i=0;i< arr.length;i++){
            if (arr[i]%2==0){
                arr2[dx]=arr[i];
                dx++;
            }
        }

        System.out.println(Arrays.toString(arr2));




    }

}
