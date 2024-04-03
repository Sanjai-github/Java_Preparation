package com.sanjai.switchstatement;

import java.util.Scanner;
                   /*
                   syntax:
                   switch(value){
                   case value :
                         statement
                         break;
                    default:
                         statement
                         break;
                    */
public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = in.next();
        switch (name){
            case "Logesh":
                System.out.println("Nettapakam");
                break;
            case "Bhuvanesh":
                System.out.println("Veerampattinam");
                break;
            case "Ganesh":
                System.out.println("Villupuram");
                break;
            case "Barath":
                System.out.println("Lawspet");
                break;
            default:
                System.out.println("Not in records :");
        }
    }
}
