package com.sanjai.Properties.Abstarction.AbstractClasses;

public class AbstractMain {
    /*
     the objects can't be created for the abstract classes
     in abstract classes the variable are only declared
     the objects for the abstract classes cannot be instantiated
    */
    public static void main(String[] args) {
        Son son = new Son(25);
        Daughter daughter = new Daughter(15);

        son.career("Developer");
        son.partner(25, "random");

        daughter.career("Designer");
        daughter.partner(15,"random");

        System.out.println();

        Son son1 = new Son(30);
        son1.career("Engineer");
        Daughter daughter1 = new Daughter(20);
        daughter1.career("Doctor");

        System.out.println();

        System.out.println(son1.value);
        Parents.hello();
        son1.normal();

    }
}
