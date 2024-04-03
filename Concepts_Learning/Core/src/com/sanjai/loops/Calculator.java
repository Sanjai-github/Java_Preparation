package com.sanjai.loops;

import java.util.Scanner;
       /*
       Create a calculator program which gets infinite input till user presses "x" or "X"
       */
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.print("Enter the operator : ");
            char op = in.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter the Num 1 value : ");
                int num1 = in.nextInt();
                System.out.print("Enter the Num 2 value : ");
                int num2 = in.nextInt();
                if(op == '+'){
                    System.out.println(" Answer = "+ (num1 + num2));
                }
                if(op == '-'){
                    System.out.println(" Answer = "+ (num1 - num2));
                }
                if(op == '*'){
                    System.out.println(" Answer = "+ (num1 * num2));
                }
                if(op == '/'){
                    if(num2 == 0){
                        System.out.println("Invalid divisor :( ");
                    }
                    else {
                        System.out.println(" Answer = " + (num1 / num2));
                    }
                }
                if(op == '%'){
                    System.out.println(" Answer = "+ (num1 % num2));
                }
            } else if (op == 'X' || op == 'x'){
                break;
            }
            else{
                System.out.println("Enter the valid operator :( ");
            }
        }
    }
}
