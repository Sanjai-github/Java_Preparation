package com.sanjai.Properties.Polymorphism.OverLoading;

public class Shapes {
    static void Area (int radius){
        double area = (float) (Math.PI * radius * radius);
        System.out.println(area);
    }

    static void Area (int base , int height){
        double area = (float) (0.5 * base * height);
        System.out.println(area);
    }
}
