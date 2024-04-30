package com.sanjai.Properties.Polymorphism.OverRiding;

public class Circle extends Shapes {

    int radius;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
     void Area (){
        System.out.println("Area : pie * r * r ");
    }
}
