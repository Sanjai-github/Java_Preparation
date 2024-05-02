package com.sanjai.Properties.Abstarction.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car1 = new Car();
//        car1.start();
//        car1.accelerate();
//        car1.brake();
//        car1.stop();
//
//        Media Carmedia = new Car();
//        Carmedia.stop();

       MyCar car = new MyCar();
       car.start();
       car.upgrade(new ElectricEngine());
       car.stop();
       car.startMusic();
       car.accelerate();
       car.stopMusic();
       car.upgrade(new DieselEngine());
       System.out.println(Engine.PRICE);

    }
}
