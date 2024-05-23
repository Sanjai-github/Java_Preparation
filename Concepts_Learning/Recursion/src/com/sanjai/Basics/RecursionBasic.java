package com.sanjai.Basics;

public class RecursionBasic {
    //RECURSION : It means that the function calling itself.


// recursive function for printing Nto1

    static void fun1(int n){
        if (n==0) return;
        System.out.println(n);
        fun1(n-1);
    }

// recursive function for printing 1toN

static void fun2(int n){
    if (n==0) return;
    fun2(n-1);
    System.out.println(n);
}

// recursive function for printing Nto1 and 1toN
static void fun3(int n){
    if (n==0) return;
    System.out.println(n);
    fun3(n-1);
    System.out.println(n);
}

    public static void main(String[] args) {
        fun1(5);
        System.out.println();
        fun2(10);
        System.out.println();
        fun3(3);
    }
}
