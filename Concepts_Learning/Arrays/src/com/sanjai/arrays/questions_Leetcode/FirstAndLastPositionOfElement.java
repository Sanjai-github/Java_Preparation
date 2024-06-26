package com.sanjai.arrays.questions_Leetcode;

import java.util.Arrays;

/*
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
*/
public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int []nums = {0,0,1,2,2} ;
        int target = 2;
        int []ans = searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int search(int []nums,int target,boolean isFirst){
        int ans =-1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start+(end - start)/2;
            if(target == nums[mid]){
                ans = mid;
                if(isFirst){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }else if (target > nums[mid]) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }

        }
        return ans;
    }
}
