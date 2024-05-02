package com.sanjai.Generics.CustomArrayList;

public class Main {

    /*
     In this Custom Arraylist the list is created with only one datatype
     this is the drawback for the list class
     to overcome these generics are used
     */
    public static void main (String[] args){
        CustomArrayList list= new CustomArrayList();
        list.add(15);
        list.add(465);
        list.set(2,45);
        System.out.println(list);

        CustomArrayList list1 = new CustomArrayList();
        for (int i = 0; i < 15; i++) {
            list1.add(i);
        }
        System.out.println(list1);
    }
}
