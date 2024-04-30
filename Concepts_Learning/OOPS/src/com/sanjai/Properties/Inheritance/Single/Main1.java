package com.sanjai.Properties.Inheritance.Single;

public class Main1 {
    public static void main(String[] args) {

        // here Box is the parent class
        // And BoxWeight is the Child class


        Box obj = new Box(15, 15, 9);
        System.out.println(obj.l);
        System.out.println(obj.w);
        System.out.println(obj.h);

        System.out.println();


        BoxWeight obj1 = new BoxWeight();
        System.out.println(obj1.Weight);

        System.out.println();

        BoxWeight obj2 = new BoxWeight(15, 23, 48, 99);
        System.out.println(obj2.Weight);
        System.out.println(obj2.h);
        System.out.println(obj2.l);
        System.out.println(obj2.w);

        System.out.println();

        Box obj3 = new Box(obj);
        System.out.println(obj3.l);
        System.out.println(obj3.w);
        System.out.println(obj3.h);
    }
}

