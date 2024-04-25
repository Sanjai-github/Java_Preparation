package com.sanjai.arrays.questions_Leetcode;

public class MissingNo {
    public static void main(String []args){
        int []nums ={9,6,4,2,3,5,7,0,1};
        int ans = missingNumber(nums);
        System.out.println(ans);
    }
    static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int crt = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[crt]){
                swap(nums,i,crt);
            }
            else {
                i++;
            }
        }
        for (int j = 1; j < nums.length; j++) {
            if(j != nums[j]){
                return j;
            }
        }
        return nums.length;
    }
    static void swap(int[] nums,int from, int to){
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }
}
