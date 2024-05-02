package com.sanjai.Generics.CustomArrayList;

import java.util.Arrays;

public class CustomArrayList {
    private int []data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isfull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int []temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isfull() {
        return size == data.length;
    }
    public int det(int index){
        return data[index];
    }

    public int size (){
        return size;
    }
    public void set(int index , int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
