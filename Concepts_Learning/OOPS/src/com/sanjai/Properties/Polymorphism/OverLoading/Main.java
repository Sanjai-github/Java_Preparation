package com.sanjai.Properties.Polymorphism.OverLoading;

public class Main {

    /*
      Polymorphism is of two types they are :
    * Static or compile time polymorphism, and it can be achieved by OverLoading
    * Dynamic or run time polymorphism, and it can be achieved by OverRiding

    This is the compile time polymorphism / static polymorphism

     In this polymorphism the Shapes class area method is overloaded depends on the arguments

    */

    public static void main(String[] args){
        Shapes.Area(15);
        Shapes.Area(15,20);
    }
}
