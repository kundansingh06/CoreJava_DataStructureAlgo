package com.kundan.algo.searching;
public class BinarySearch_Recursive {
    public static void main(String args[]){
        int arr[]={2,3,8,10,12,15,20};
        int searchelement=12;
        int last=arr.length-1;
        int result = bsRecur(arr,0,last,searchelement);
        if (result == -1)
            System.out.println("Element is not found!");
        else
            System.out.println("Element is found at index: "+result);
    }
    public static int bsRecur(int arr[], int first, int last, int key){
        if (last>=first){
            int mid = first + (last - first)/2;
            if (arr[mid] == key){
                return mid;
            }
            if (arr[mid] > key){
                return bsRecur(arr, first, mid-1, key);//search in left subarray
            }
            else{
                return bsRecur(arr, mid+1, last, key);//search in right subarray
            }
        }
        return -1;
    }

}
