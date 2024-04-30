package com.sanjai.Generics.CustomGenericArrayList;

import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private Object[]data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArrayList(){
      data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isfull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object []temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isfull() {
        return size == data.length;
    }
    public T get(int index){
        return (T) data[index];
    }

    public int size (){
        return size;
    }
    public void set(int index , T value){
        data[index] = value;
    }
    public T remove (){
        T removed = (T)(data[size--]);
        return removed;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
