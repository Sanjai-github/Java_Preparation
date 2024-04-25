package com.sanjai.arrays.questions_Leetcode;

public class EvenDigits {
    // nums = [12,345,2,6,7896]
    public static void main(String[] args) {
        int []nums = {12,345,2,1542,6,7896};
        int ans = findNumbers(nums);
        System.out.println(ans);

    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums ){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int dig = 0;
        while(num > 0){
            num/=10;
            dig++;
        }
        return (dig%2 == 0);
    }
}
