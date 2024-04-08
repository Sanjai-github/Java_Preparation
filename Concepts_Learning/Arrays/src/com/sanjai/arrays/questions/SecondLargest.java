package com.sanjai.arrays.questions;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = in.nextInt();
        System.out.print("Enter the array elements : ");
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int Slar = BruteForce(arr);
        System.out.println(Slar);
    }
    static int BruteForce(int[]arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        return arr[arr.length - 2];
    }
}
