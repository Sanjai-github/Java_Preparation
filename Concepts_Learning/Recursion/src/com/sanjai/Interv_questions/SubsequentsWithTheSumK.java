package com.sanjai.Interv_questions;

import java.util.ArrayList;

public class SubsequentsWithTheSumK {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] arr = {6,5,1,2,1,4};
        int n = arr.length;
        int sum = 6;
        subprint(0, n,0, sum, arr, list);
    }
    static void subprint(int i, int n, int s,int sum,int []arr,ArrayList<Integer>list){
        if (s == sum) {
            System.out.println(list);
           return;
        }
         if (i==n){
             return;
         }
        list.add(arr[i]);
        s += arr[i];
        subprint(i+1,n, s,sum,arr,list);
        list.remove(list.size()-1);
        s -= arr[i];
        subprint(i+1,n, s,sum,arr,list);
    }
}
