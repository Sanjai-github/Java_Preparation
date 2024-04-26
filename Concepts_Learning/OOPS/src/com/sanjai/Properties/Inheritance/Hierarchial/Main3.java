package com.sanjai.Properties.Inheritance.Hierarchial;

public class Main3 {
    public static void main(String[] args) {
        Faculties A = new Faculties("Muruganatham");

        System.out.println(A.Area);
        System.out.println(A.Name);
        System.out.println(A.ClgName);

        System.out.println();

        Students B = new Students("Barath");

        System.out.println(B.Area);
        System.out.println(B.Name);
        System.out.println(B.ClgName);

        System.out.println();

        SupportStaffs C = new SupportStaffs(59,"HARI");

        System.out.println(C.Area);
        System.out.println(C.Name);
        System.out.println(C.ClgName);
        System.out.println(C.age);
        System.out.println(C.Busses);

    }
}
