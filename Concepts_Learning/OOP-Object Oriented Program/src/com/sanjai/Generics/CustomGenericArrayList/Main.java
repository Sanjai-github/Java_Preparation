package com.sanjai.Generics.CustomGenericArrayList;

public class Main {
    public static void main (String[] args){
        CustomGenericArrayList<String> List = new CustomGenericArrayList<>();
        List.add("Hi");
        List.add("hello");
        List.set(2,"how");
        System.out.println(List);

        CustomGenericArrayList<Integer> List1 = new CustomGenericArrayList<>();
        List1.add(14);
        List1.add(15);
        List1.set(2,16);
        System.out.println(List1);

        CustomGenericArrayList<Double> List2 = new CustomGenericArrayList<>();
        List2.add(14.15);
        List2.add(15.251);
        List2.set(2,16.15);
        System.out.println(List2);

        CustomGenericArrayList<Character> List3 = new CustomGenericArrayList<>();
        List3.add('a');
        List3.add('b');
        List3.set(2,'b');
        System.out.println(List3);

        CustomGenericArrayList<Boolean> List4 = new CustomGenericArrayList<>();
        List4.add(true);
        List4.add(true);
        List4.set(2,false);
        System.out.println(List4);

    }
}
