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
        int ans = optimal(arr);
        System.out.println(ans);
    }
    static int BruteForce(int[]arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int lar = arr.length-1;
        int Seclar = arr.length-2;
        for (int i = lar; i > 0 ; i--) {
            if(arr[Seclar] == arr[Seclar-1]){
                Seclar = Seclar-1;
            }
            else {
            break;
            }
        }
        return arr[Seclar];
    }
    static int Better(int []arr){
        int n = arr.length;
        int largest = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= largest) {
                largest = arr[i];
            }
        }
        int secLar = -1;
        for (int i = 0; i < n ; i++) {
            if(arr[i] != largest && arr[i] > secLar){
                secLar = arr[i];
            }
        }
        return secLar;
    }
    static int optimal(int []arr){
         int n = arr.length;
         int lar = 0;
         int Seclar = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i] > lar){
                Seclar = lar;
                lar =arr[i];
            }
            else if(arr[i] < lar && arr[i] > Seclar){
                Seclar = arr[i];
            }
        }
        return Seclar;
    }
}
