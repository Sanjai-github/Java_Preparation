package com.sanjai.arrays.questions_Leetcode;

import java.util.Arrays;

public class ArrayShuffle {
    public static void main(String[] args) {
        int [] nums = {1,1,2,2};
        int [] Ans = shuffle(nums,2);
        System.out.println(Arrays.toString(Ans));
    }
    public static int[] shuffle(int[] nums, int n){
        int []ans = new int[n*2];
        int i = 0;
        int j = n;

        for (int k = 0; k < ans.length; k+=2) {

            ans[k] = nums[i];
            ans[k+1] = nums[j];
            i ++;
            j ++;
            if(j> 2*n || k > 2*n){
                break;
            }
        }
        return ans;
    }
}
