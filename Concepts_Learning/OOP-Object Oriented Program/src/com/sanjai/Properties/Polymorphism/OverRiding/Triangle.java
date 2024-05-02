package com.sanjai.Properties.Polymorphism.OverRiding;

public class Triangle extends Shapes{

    int base;
    int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }

    @Override
    void Area (){
        System.out.println("Area : 0.5 * b * h ");
    }
}