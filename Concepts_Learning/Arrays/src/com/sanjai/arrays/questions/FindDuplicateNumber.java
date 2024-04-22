package com.sanjai.arrays.questions;

public class FindDuplicateNumber {
    public static void main (String []args){
        int [] nums = {1,3,4,2,2};
        int ans = findDuplicate(nums);
        System.out.println(ans);
    }
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int crt = nums[i]-1;
            if(nums[i] != nums[crt]){
                swap(nums,i,crt);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                return nums[j];
            }
        }
        return -1;
    }
    static void swap (int[] nums, int from, int to){
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }
}
