package com.kundan.algo.searching;
/******
 * Linear search can be used irrespective of whether the array is sorted or not.
 * It can be used on arrays of any data type.Not suitable for large arrays.
 * Time Complexity:
 * Best Case: In the best case, the key might be present at the first index. O(1)
 * Worst Case: In the worst case, the key might be present at the last index So the worst-case complexity is O(N) where N is the size of the list.
 * Average Case: O(N)
 *
 */
public class LinearSearch_Iterative {
    public static void main(String[] args) {
        int arr[]={2,3,8,10,12,15,20};
        int searchelement=12;
        int result=searchIterative(arr,searchelement);
        if (result==-1){
            System.out.println("Element "+searchelement+" is not present in array");
        }
        else{
            System.out.println("Element "+searchelement+" is present at index "+result);
        }
    }

    private static int searchIterative(int[] arr, int searchelement) {
        for(int i=0;i< arr.length;i++){
            if (arr[i]==searchelement){
                return i;
            }
        }
        return -1;
    }
}
