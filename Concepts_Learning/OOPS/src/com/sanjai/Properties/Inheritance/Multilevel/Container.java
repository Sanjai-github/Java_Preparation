package com.sanjai.Properties.Inheritance.Multilevel;

public class Container {
    int l;
    int h;
    int w;

    public Container() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    public Container(int side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    public Container(int l, int h, int w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public Container(Container old ) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
}
