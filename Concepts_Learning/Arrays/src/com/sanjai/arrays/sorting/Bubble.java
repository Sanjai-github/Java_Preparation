package com.sanjai.arrays.sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int []arr = {3, 5, 1, 2, 4};
        search(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void search(int []arr){
        boolean swaped ;
        for (int i = 0; i < arr.length; i++) {
            swaped = false;
            for (int j = 1; j < arr.length-i ; j++) {
                // if the element in the j-index is less than the element int the (j-1) - index then swap these two elements
                if (arr[j] < arr[j-1]){
                    swap(arr, j,j-1);
                    swaped = true;
                }
                /*
                * if the swap doesn't take place for an entire pass that means that array is sorted then the loop will break */
            }if (!swaped){
                break;
            }
        }
    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
