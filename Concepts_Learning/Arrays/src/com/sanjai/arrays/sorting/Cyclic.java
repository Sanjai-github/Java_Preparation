package com.sanjai.arrays.sorting;

import java.util.Arrays;

public class Cyclic {
    /*
    the cyclic sort is applicable only if the array contains the continues values
    either from (1 to n) or (0 to n)
    */
    public static void main(String []args){
        int []arr = {3, 5, 1, 2, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int []arr){
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i ,correct);
            }else
                i++;
        }

    }
    static void swap(int[]arr, int from , int to){
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}
