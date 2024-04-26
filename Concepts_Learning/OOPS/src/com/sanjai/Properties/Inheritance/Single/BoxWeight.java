package com.sanjai.Properties.Inheritance.Single;

public class BoxWeight extends Box{
    float Weight;

    public BoxWeight(){
        this.Weight = -1;
    }

    public BoxWeight(float weight) {
        this.Weight = weight;
    }

    public BoxWeight(int l, int h, int w, float weight) {
        super(l, h, w);
        // super keyword is used to get the property values from their parent class
       this.Weight = weight;
    }
}
