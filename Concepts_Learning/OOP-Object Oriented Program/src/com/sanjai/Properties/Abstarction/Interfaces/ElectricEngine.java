package com.sanjai.Properties.Abstarction.Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine stops");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric Engine accelerates");
    }
}
