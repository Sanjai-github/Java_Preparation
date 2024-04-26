package com.sanjai.Properties.Inheritance.Single;

public class Box {
    int l;
    int h;
    int w;

    public Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    public Box(int side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    public Box(int l, int h, int w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public Box( Box old ) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
}
