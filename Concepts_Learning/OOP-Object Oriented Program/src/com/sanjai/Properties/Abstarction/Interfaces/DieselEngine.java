package com.sanjai.Properties.Abstarction.Interfaces;

public class DieselEngine implements Engine{
    @Override
    public void start() {
        System.out.println("DieselEngine Starts");
    }

    @Override
    public void stop() {
        System.out.println("DieselEngine Stops");
    }

    @Override
    public void accelerate() {
        System.out.println("DieselEngine accelerates");
    }
}
