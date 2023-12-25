package com.kundan.Array.prog1;
import java.util.Arrays;
public class ResizeArray {
    public static void main(String[] args) {
        int [] arr={8,1,3,0,4};
        System.out.println(Arrays.toString(arr)+" "+arr.length);
        resizeArray(arr,10);
        System.out.println(Arrays.toString(arr)+" "+arr.length);
    }
    private static void resizeArray(int[] arr,int capacity) {
        int [] tmp=new int[capacity];
        for (int i=0;i< arr.length;i++){
            tmp[i]=arr[i];
        }
        arr=tmp;
    }

}
