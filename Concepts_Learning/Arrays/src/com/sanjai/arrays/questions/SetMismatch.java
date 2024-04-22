package com.sanjai.arrays.questions;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String []args){
        int []nums = {3,2,2};
        int []ans = findErrorNums(nums);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int crt = nums[i] - 1;
            if(nums[i] != nums[crt]){
                swap(nums,i,crt);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                return new int[]{nums[j] , j+1};
            }
        }
        return new int[] {-1 , -1};
    }
    static void swap (int []nums ,int from, int to){
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }
}
