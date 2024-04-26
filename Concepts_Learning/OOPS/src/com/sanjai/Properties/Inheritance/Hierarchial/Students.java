package com.sanjai.Properties.Inheritance.Hierarchial;

public class Students extends College{
    String Name;

    public Students(String name) {
        Name = name;
    }

    public Students() {
        this.Name = "Default";
    }
}
