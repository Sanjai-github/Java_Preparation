package com.sanjai.Simple_Questions;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        for (int k : arr){
            System.out.print(k);
        }
        reverse(arr,0);
        System.out.println();
        for (int j : arr) {
            System.out.print(j);
        }
    }
    static void reverse(int []arr,int i){
        if (i> arr.length/2) return;
        swap(arr,i, arr.length-i-1);
        reverse(arr, i+1);

    }
    static void swap (int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
