package com.sanjai.SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.AddFirst(15);
        list.AddFirst(17);
        list.AddFirst(5);

        list.display();

        System.out.println();

        list.AddLast(99);
        list.display();
        list.Size();

        list.Add(2,4);
        list.display();
        list.Size();

        System.out.println(list.DeleteFirst());
        list.display();
        list.Size();

        System.out.println(list.DeleteLast());
        list.display();
        list.Size();

        System.out.println();

        list.AddLast(48);
        list.AddFirst(465);
        list.Add(23,3);
        list.display();
        list.Size();

        System.out.println();

        System.out.println(list.Delete(3));
        list.display();
        list.Size();

    }
}
