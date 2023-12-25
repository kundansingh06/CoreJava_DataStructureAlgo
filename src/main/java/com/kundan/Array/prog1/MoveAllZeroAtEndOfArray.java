package com.kundan.Array.prog1;

public class MoveAllZeroAtEndOfArray {
    public static void main(String[] args) {
        int [] arr={8,1,3,0,4,0,6};

        int j=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0 && arr[j]==0){
                int tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
            }
            if(arr[j]!=0){
                j++;

            }
        }





    }
}
