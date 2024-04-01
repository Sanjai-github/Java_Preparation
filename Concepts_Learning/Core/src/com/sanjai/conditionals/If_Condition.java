package com.sanjai.conditionals;

import java.util.Scanner;

public class If_Condition {
    public static void main(String[] args) {
        /*
        Syntax for if statement
        if(conditions gives T or F){
        statement body.
        }
        simple voter eligible problem
        */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = in.nextInt();
        if(age > 18){
            System.out.println("You are eligible to vote :) ");
        } else if (age ==18) {
            System.out.println("You can vote on this Election :) ");
        }
        else {
            System.out.println("You need to wait for " + (18-age) + " years to vote");
        }
    }
}
