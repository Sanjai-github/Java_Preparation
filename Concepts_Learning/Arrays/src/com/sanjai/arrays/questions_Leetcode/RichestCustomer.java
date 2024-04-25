package com.sanjai.arrays.questions_Leetcode;

public class RichestCustomer {
    /*
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
*/
    public static void main(String[] args) {
        int [][]accounts = {
                {1,2,3,5},
                {3,2,100}
        };
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }
    static int maximumWealth(int[][] accounts) {
        int Max = 0;
        for (int[]nums : accounts){
            int Sum = 0;
            for(int num : nums){
                Sum += num;
                if(Sum > Max){
                    Max = Sum;
                }
            }
        }
        return Max;

    }
}
