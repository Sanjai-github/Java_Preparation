package com.sanjai.OOP.Introduction;

public class OopIntro {
    // class is the named group of properties and function
    // objects are the instances of the class
    // final keyword is used in primitives not to change its values
    // final keyword is used in objects not to re-assign to other classes
    public static void main(String[] args) {
        Student A = new Student();
        A.name = "Ajith";
        A.rollNo = 1;
        A.marks = 89.2f;

        System.out.println(A.rollNo);
        System.out.println(A.name);
        System.out.println(A.marks);

        System.out.println();

        Student B = new Student();
        // it calls the constructor with no arguments
        System.out.println(B.rollNo);
        System.out.println(B.name);
        System.out.println(B.marks);

        System.out.println();

        Student C = new Student(2 , "logesh" , 99.2f);
        // it calls the constructor with three arguments

        System.out.println(C.rollNo);
        System.out.println(C.name);
        System.out.println(C.marks);

        System.out.println();

        B.changeName("ganesh");
        // it changes the name of the Student objects
        System.out.println(B.name);

        System.out.println();

//        final int present = 50;
//        present = 100;

        final Student D = new Student(4,"Bhuvi",100);
        System.out.println(D.name);
        D.name = "Bhuvanesh";
        System.out.println(D.name);
//      D = new Student(10,"other name",94.76f);
    }

    // create a class
    static class Student {
        int rollNo ;
        String name ;
        float marks ;
        Student(){
            this.rollNo = 0;
            this.name = "Default";
            this.marks = 0.0f;
        }
        void changeName (String name){
            this.name  = name;
        }
        Student ( int rollNo ,String name , float marks){
            this.rollNo = rollNo ;
            this.name = name;
            this.marks = marks;
        }
    }
}
