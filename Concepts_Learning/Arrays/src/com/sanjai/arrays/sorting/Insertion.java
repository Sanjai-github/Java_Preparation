package com.sanjai.arrays.sorting;

import java.util.Arrays;

public class Insertion {
    public static void main (String[]args){
        int []arr ={3, 5, 1, 2, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));;

    }
    static void sort(int[]arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j >0; j--) {
                if (arr[j] < arr[j-1]){
                    swap( arr, j,j-1);
                }else {
                    break;
                }
            }
        }
    }
    static void swap(int[]arr,int from ,int to){
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}
