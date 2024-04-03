package com.sanjai.switchstatement;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = in.next();
        switch (name) {
            case "Logesh" -> System.out.println("Nettapakam");
            case "Bhuvanesh" -> System.out.println("Veerampattinam");
            case "Ganesh" -> System.out.println("Villupuram");
            case "Barath" -> System.out.println("Lawspet");
            case "Nigesh" -> System.out.println("Instagram");
            default -> System.out.println("Not in records :");
        }
    }
}
