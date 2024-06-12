package com.sanjai.arrays.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int [] arr = {5,4,3,2,1};
        System.out.println("Before sort");
        System.out.println(Arrays.toString(arr));
        sort(arr , 0 , arr.length - 1);
        System.out.println("After sort");
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int high) {

        int s = low ;
        int e = high;

        if(s >= e) return;

        int mid = e - (e - s) /2;

        int pivot = arr[mid];


        while( s <= e ){

            while (arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }

            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        sort(arr, low, mid-1);
        sort(arr, mid+1, high);

    }
}
