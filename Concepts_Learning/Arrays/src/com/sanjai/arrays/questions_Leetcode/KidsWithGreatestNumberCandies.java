package com.sanjai.arrays.questions_Leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberCandies {
    public static void main(String[] args) {
       int [] candies = {2,3,5,1,3};
       int extraCandies = 3;
       List<Boolean> Ans = kidsWithCandies(candies,extraCandies);
        System.out.println(Ans.toString());
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int Max = m(candies);

        List<Boolean>Ans = new ArrayList<>();
        for(int i = 0; i < candies.length ; i ++){
            if(candies[i] + extraCandies >= Max){
                Ans.add(Boolean.TRUE);
            }else
                Ans.add(Boolean.FALSE);
        }
        return Ans;

    }
    static int m(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
