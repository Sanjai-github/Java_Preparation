package com.sanjai.Properties.Abstarction.AbstractClasses;

public abstract class Parents {
    /*
    the class which contains one abstract methods then the class should be declared as abstract class
    the abstract classes can contain both abstract methods and normal methods
    the abstract classes can contain static method as static methods doesn't depend on objects
    it also can contain final values.
     */
    int age;
    final int value;

    public Parents(int age) {
        this.age = age;
        value = 1554;
    }

    // static method
    static void hello(){
        System.out.println("hey hi!");
    }

    // normal method

    void normal(){
        System.out.println("normal hi!");
    }

    public abstract void career (String name);
    public abstract void partner(int age ,String name);
}
