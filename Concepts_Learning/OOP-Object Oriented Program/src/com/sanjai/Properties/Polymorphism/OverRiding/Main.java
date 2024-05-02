package com.sanjai.Properties.Polymorphism.OverRiding;

public class Main {

    /*
      Polymorphism is of two types they are :
    * Static or compile time polymorphism, and it can be achieved by OverLoading
    * Dynamic or run time polymorphism, and it can be achieved by OverRiding

    This is the run time polymorphism / Dynamic polymorphism

     In this polymorphism the Area method is over rided by their own Area method.
     In this the original java provided toString is OverRided to their own toString Methods

    */
    public static void main (String[] args){
        Shapes shape = new Shapes();
        Circle circle = new Circle(15);
        Square square = new Square(50);
        Triangle triangle = new Triangle(10,20);

        triangle.Area();
        System.out.println(triangle);

        System.out.println();

        circle.Area();
        System.out.println(circle);

        System.out.println();

        triangle.Area();
        System.out.println(triangle);

        System.out.println();

        square.Area();
        System.out.println(square);

        System.out.println();

        shape.Area();

    }
}
