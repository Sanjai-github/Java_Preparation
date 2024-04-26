package com.sanjai.Properties.Inheritance.Multilevel;

public class ContainerCost extends ContainerWeight{
    int price;

    public ContainerCost(int price) {
        this.price = price;
    }
    ContainerCost(){
        this.price = -1;
    }

    ContainerCost(int l , int h , int w , float Weight , int price ){
        super(l, h, w, Weight);
        this.price = price;
    }
}
