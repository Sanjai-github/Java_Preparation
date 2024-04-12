package com.sanjai.arrays.searching;

import java.util.Scanner;

public class Linear {
    /* linear search is a technique where the elements in an array is iterated fully until the target is reached  */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Array size : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the "+ n + " elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the target element : ");
        int target = in.nextInt();
        int ans = Search(arr,target);
        System.out.println(ans);
    }
    static int Search (int[] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
