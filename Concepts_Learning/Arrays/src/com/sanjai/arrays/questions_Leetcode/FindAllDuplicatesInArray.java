package com.sanjai.arrays.questions_Leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {
    public static void main(String[] args){
        int []nums = {4,3,2,7,8,2,3,1};
        List<Integer> Ans = new ArrayList<>(findDuplicates(nums));
        System.out.println(Ans);
    }
    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int crt = nums[i]-1;
            if(nums[i] != nums[crt]){
                swaping(nums,i,crt);
            }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                ans.add(nums[j]);
            }
        }
        return ans;
    }
    static void swaping(int[] nums, int from, int to){
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }
}
