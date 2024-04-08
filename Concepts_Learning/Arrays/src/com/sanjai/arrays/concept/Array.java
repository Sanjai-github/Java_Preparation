package com.sanjai.arrays.concept;

import java.util.Arrays;
import java.util.Scanner;
/*
Arrays is a basic data structure in a java, where Array is a collection of similar data type elements.
it consists of
            * initialization : int []arr;
            * declaration : arr = new int[size];
            * combination of both initialization and declaration : int []arr = new int[size];
printing methods :
            * using Arrays.toString method
            * using for loop
            * using for-each loop
giving inputs :
            * directly assigning into the array.
            * getting input from user using for loop.
 */
public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //**************getting output*****************
        int[] arr = {1, 2, 3, 4, 5};
        // using for loop.
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        //using arrays function
        System.out.println(Arrays.toString(arr));
        // using for-each loop
        for (int nums:arr){
            System.out.print(nums + " ");
        }
        //**************giving input******************
        //assigning values directly
        int [] ages = {10,20,30,40,50,60};
        System.out.println(" ");
        //using for loop

        int [] roll = new int[5];
        System.out.println("enter the array values : ");
        for (int i = 0; i < roll.length; i++) {
            roll[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(roll));
    }
}
