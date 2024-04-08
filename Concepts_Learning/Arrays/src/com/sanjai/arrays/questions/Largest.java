package com.sanjai.arrays.questions;
import java.util.Arrays;
import java.util.Scanner;

/*
* Question : find the largest no. in an array.
*/
public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = in.nextInt();
        System.out.print("Enter the array elements : ");
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int lar = Optimal(arr);
        System.out.println(lar);
    }
    static int BruteForce(int[]arr){
        Arrays.sort(arr);
        return arr[arr.length -1];
    }
    static int Optimal(int [] arr){
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
}
