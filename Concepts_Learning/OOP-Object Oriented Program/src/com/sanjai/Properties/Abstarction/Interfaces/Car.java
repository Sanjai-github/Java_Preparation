package com.sanjai.Properties.Abstarction.Interfaces;

public class Car implements Engine , Brake , Media{
    @Override
    public void start() {
        System.out.println("Engine Started normally");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopped normally");
    }

    @Override
    public void accelerate() {
        System.out.println("Engine accelerated normally");
    }

    @Override
    public void brake() {
        System.out.println("Brake applied normally ");
    }
}
