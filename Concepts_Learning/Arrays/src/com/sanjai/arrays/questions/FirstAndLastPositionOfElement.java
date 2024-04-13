package com.sanjai.arrays.questions;

import java.util.Arrays;

/*
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
*/
public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int []nums = {5,7,7,8,8,10} ;
        int target = 7;
        int []ans = searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target) {
        int start = 0,end=0;
        int[] ans = {start,end};
        for(int i = 0; i<nums.length - 1; i++){
            if (nums[i] == target){
                 start = i;
            }
        }
        for (int j = nums.length - 1; j > 0; j--){
            if (nums[j] == target){
                end = j;
            }
        }
        return ans;
    }
}
