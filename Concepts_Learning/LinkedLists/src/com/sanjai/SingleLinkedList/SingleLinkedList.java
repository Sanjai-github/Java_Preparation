package com.sanjai.SingleLinkedList;

public class SingleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SingleLinkedList() {
       size = 0;
    }

    public void AddFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public void AddLast(int value){
        if(tail == null){
            AddFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size ++;
    }

    public void Add(int value, int index){
        if (index == 0) {
            AddFirst(value);
            return;
        }
        if(index == size){
            AddLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;
    }

    public  int DeleteFirst(){
        int value = head.value;
        head = head.next;
        if(head == null)
            tail = head;
        size --;
        return value;
    }

    public int DeleteLast() {
        if(size<=1){
            return DeleteFirst();
        }
        Node secondLast = get(size-2);
        int value = tail.value;
        tail = secondLast;
        tail.next=null;
        size--;
        return value;
    }

    public int Delete(int index){
        if(index == 0){
            return DeleteFirst();
        }
        if (index == size - 1){
            return DeleteLast();
        }
        Node prev = get(index);
        int value = prev.next.value;
        prev.next = prev.next.next;
        size --;
        return value;
    }

    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void Size(){
        System.out.println("Size : "+size);
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+ " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;
        public Node (int value){
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
