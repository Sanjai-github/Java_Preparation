package com.sanjai.arrays.questions_Leetcode;

public class NumberGoodPairs {
    public static void main(String[] args) {
       int []nums = {1,1,1,1};
       int ans = numIdenticalPairs(nums);
        System.out.println(ans);
    }
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length ; i++){
            for (int j = 0; j <nums.length; j++) {
                if(j != i){
                    if (nums[i] == nums[j]){
                        count ++;
                    }
                }
            }
        }
        return count/2;
    }
}
