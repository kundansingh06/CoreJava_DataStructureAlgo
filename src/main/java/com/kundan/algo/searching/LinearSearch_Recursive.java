package com.kundan.algo.searching;
public class LinearSearch_Recursive {
    public static void main(String[] args) {
        int arr[]={2,3,8,10,12,15,20};
        int searchelement=12;
        int result = searchRecursive(arr, arr.length, searchelement);
        if (result == -1) {
            System.out.println("Element " + searchelement + " is not present in array");
        } else {
            System.out.println("Element " + searchelement + " is present at index " + result);
        }
    }
    static int searchRecursive(int arr[], int size, int key) {
        if (size == 0) {return -1;
        }
        else if (arr[size - 1] == key) {
            return size - 1;
        }
        else {
            return searchRecursive(arr, size - 1, key);
        }
    }
}
