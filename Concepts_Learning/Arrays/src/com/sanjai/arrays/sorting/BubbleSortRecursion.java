package com.sanjai.arrays.sorting;

import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int []arr = {1,5,6,10,15,52,78,96};
        int target = 96;
        int result = sort(arr,0,arr.length-1,target);
        System.out.println(result);
    }

    static int sort(int[] arr, int low, int high, int target) {

        if(low > high) return -1;

        int mid = high - (high-low)/2;

        if(arr[mid] == target){
            return mid;
        } else if (target < arr[mid]) {
            return sort(arr, low, mid-1, target);
        }else
            return sort(arr, mid+1, high, target);

    }
}
