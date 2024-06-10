package com.sanjai.questions;

public class NumberOfEmployeesWhoMetTheTarget {
    public static void main(String[] args) {
        int []hours = { 5,1,4,2,2};
        int target = 6;
        System.out.println(numberOfEmployeesWhoMetTarget( hours,target));
    }
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int sum = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) sum++;
        }
        return sum;
    }
}
