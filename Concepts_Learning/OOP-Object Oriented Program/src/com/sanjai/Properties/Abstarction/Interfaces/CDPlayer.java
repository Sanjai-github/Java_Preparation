package com.sanjai.Properties.Abstarction.Interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Music Start");
    }

    @Override
    public void stop() {
        System.out.println("Music Stop");
    }
}
