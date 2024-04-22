package com.sanjai.arrays.sorting;

import java.util.Arrays;

public class Selection {
    /*
    In general Selection sort is sorted by selecting the max value
    in the array and swap that with the last element.
    */
    public static void main(String []args){
        int []arr = {3, 5, 1, 2, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int []arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 -i;
            int Max = getMax(arr,0,last);
            swap(arr,Max,last);
        }
    }
    static int getMax(int []arr, int start,int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[i] >= arr[start]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int []arr,int from,int to){
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;

    }
}
