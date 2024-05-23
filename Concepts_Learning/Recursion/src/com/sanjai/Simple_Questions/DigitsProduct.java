package com.sanjai.Simple_Questions;

public class DigitsProduct {
    static int dig_prod(int n){
        if (n <= 1) return n;
        return n%10 * dig_prod(n/10);
    }
    public static void main(String[] args) {
        int ans = dig_prod(1342);
        System.out.println(ans);
    }
}
