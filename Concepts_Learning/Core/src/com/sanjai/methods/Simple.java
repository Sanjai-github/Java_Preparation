package com.sanjai.methods;

import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {

        add();
        sub();
    }
    static void add(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of Num1 & Num2 to add : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Sum = "+ (num1 + num2));
    }
    static void sub(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of Num1 & Num2 to sub : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Sub = "+ (num1 - num2));
    }
}
