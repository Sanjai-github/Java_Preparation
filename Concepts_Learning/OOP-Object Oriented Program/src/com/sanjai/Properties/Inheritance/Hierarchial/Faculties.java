package com.sanjai.Properties.Inheritance.Hierarchial;

public class Faculties extends College {
    String Name;
    public Faculties() {
        this.Name = "Default faculty";
    }

    public Faculties(String name) {
        this.Name = name;
    }
}
