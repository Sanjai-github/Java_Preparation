package com.sanjai.arrays.questions;

import java.util.Arrays;

/*
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
*/
public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int []nums = {5,7,7,8,8,10} ;
        int target = 8;
        int []ans = searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        if(nums.length == 1){
            ans[0] = 0;
            ans[1] = 0;
        }
        for(int i = 0; i<nums.length - 1; i++){
            if (nums[i] == target){
                ans[1] = i;
            }
        }
        for (int j = nums.length - 1; j > 0; j--){
            if (nums[j] == target){
                ans[0] = j;
            }
        }
        return ans;
    }
}
