package com.sanjai.Properties.Polymorphism.OverRiding;

public class Square extends Shapes{
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    void Area (){
        System.out.println("Area : side * side");
    }
}
