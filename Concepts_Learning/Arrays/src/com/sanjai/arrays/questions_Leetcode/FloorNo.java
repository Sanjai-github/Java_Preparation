package com.sanjai.arrays.questions_Leetcode;

import java.util.Scanner;

public class FloorNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Array size : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the "+ n + " elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the target element to get it's floor no : ");
        int target = in.nextInt();
        int ans = floorno(arr,target);
        System.out.println(ans);
    }

    static int floorno(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(target == arr[mid]){
                return arr[mid];
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[end];
    }
}
