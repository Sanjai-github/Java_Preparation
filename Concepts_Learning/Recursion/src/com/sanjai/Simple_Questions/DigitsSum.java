package com.sanjai.Simple_Questions;

public class DigitsSum {
    static int dig_sum(int n){
        if (n <= 1) return n;
        return n%10 + dig_sum(n/10);
    }
    public static void main(String[] args) {
        int ans = dig_sum(1342);
        System.out.println(ans);
    }
}
