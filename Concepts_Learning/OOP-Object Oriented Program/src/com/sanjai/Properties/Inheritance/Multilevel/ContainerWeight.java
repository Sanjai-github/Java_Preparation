package com.sanjai.Properties.Inheritance.Multilevel;

public class ContainerWeight extends Container {
    float Weight;

    public ContainerWeight(){
        this.Weight = -1;
    }

    public ContainerWeight(float weight) {
        this.Weight = weight;
    }

    public ContainerWeight(int l, int h, int w, float weight) {
        super(l, h, w);
        // super keyword is used to get the property values from their parent class
       this.Weight = weight;
    }
}
