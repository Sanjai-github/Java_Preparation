package com.sanjai.Interv_questions;

import java.util.ArrayList;

public class Subsequents {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        int[] arr = {3,1,2};
        int n = arr.length;
        subsequent(0,n,arr,list);
    }
    static void subsequent (int i, int n, int []arr ,ArrayList<Integer>list){
        if(i== n) {
            System.out.println(list);
            return;
        }
        list.add(arr[i]);
        subsequent(i+1,n,arr,list);
        list.remove(list.size()-1);
        subsequent(i+1,n,arr,list);
    }
}
