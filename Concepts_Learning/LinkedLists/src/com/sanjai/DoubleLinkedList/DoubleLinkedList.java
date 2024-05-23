package com.sanjai.DoubleLinkedList;

public class DoubleLinkedList {

    private Node head;
    private Node next;
    private Node prev;
    private int size;

    public DoubleLinkedList() {
        Node node = new Node();
            size = 0;
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node() {
            Node node = new Node();
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
