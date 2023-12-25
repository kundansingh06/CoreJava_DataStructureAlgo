package com.kundan.algo.searching;
public class BinarySearch_Iterative {
    public static void main(String args[]){
        int arr[]={2,3,8,10,12,15,20};
        int key=12;
        int last=arr.length-1;
        bsIterative(arr,0,last,key);
    }
    public static void bsIterative(int arr[], int first, int last, int key){
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }
}
