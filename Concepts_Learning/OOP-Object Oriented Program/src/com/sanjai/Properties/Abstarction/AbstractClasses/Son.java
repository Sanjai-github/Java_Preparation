package com.sanjai.Properties.Abstarction.AbstractClasses;

public class Son extends Parents {

    public Son(int age ) {
        super(age);
    }

    @Override
    public void career(String name) {
        System.out.println("I'm " + this.age + " years old");
        System.out.println("I'm going to be a "+ name);
    }

    @Override
    public void partner(int age, String name) {
        System.out.println(name + " is my partner and she is "+ age);
    }

}
