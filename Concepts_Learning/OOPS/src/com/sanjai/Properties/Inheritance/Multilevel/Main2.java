package com.sanjai.Properties.Inheritance.Multilevel;

public class Main2 {
    public static void main (String[] args ){

        ContainerCost A = new ContainerCost();

        System.out.println(A.w);
        System.out.println(A.Weight);
        System.out.println(A.price);

        System.out.println();


        ContainerCost B = new ContainerCost(1000);

        System.out.println(B.Weight);

        System.out.println();

        ContainerCost C = new ContainerCost(5,6,7,99,1001);

        System.out.println(C.h);
        System.out.println(C.l);
        System.out.println(C.w);
        System.out.println(C.Weight);
        System.out.println(C.price);


    }
}
