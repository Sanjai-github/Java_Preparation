package com.sanjai.Properties.Inheritance.Hierarchial;

public class SupportStaffs extends College{
    int age;
    String Name;

    public SupportStaffs(int age, String name) {
        this.age = age;
        this.Name = name;
    }

    public SupportStaffs() {
        this.age = -1;
        this.Name = "Default Staff";
    }
}
