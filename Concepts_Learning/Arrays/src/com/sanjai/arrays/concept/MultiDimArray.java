package com.sanjai.arrays.concept;

import java.util.Arrays;

public class MultiDimArray {
    /* in the two dimension array the row of the main array itself is an array.
    * the two-dimensional arrays are in the form of matrices
    *  {{1,2,3},
    *   {4,5,6,7},
    *   {8,9,}}*/
    public static void main(String[] args) {
        //int[][] arr = new int[3][];
       int[][] arr ={
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9,}
        };
       // print the two Dimensional Array with the for-each loop
        for (int[] a:arr) {
            System.out.println(Arrays.toString(a));
            for (int b:a)
                System.out.println(b);
        }
        // print the two Dimensional Array with the for loop
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
