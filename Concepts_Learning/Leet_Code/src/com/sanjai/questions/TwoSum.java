package com.sanjai.questions;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
       int[] nums = {150,24,79,50,88,345,3};
       int target = 200;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
