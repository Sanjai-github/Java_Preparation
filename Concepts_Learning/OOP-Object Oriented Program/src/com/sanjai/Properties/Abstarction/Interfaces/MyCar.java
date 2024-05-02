package com.sanjai.Properties.Abstarction.Interfaces;

public class MyCar {
    private Engine engine ;
    private Media player = new CDPlayer();

    public MyCar(){
        this.engine = new DieselEngine();
    }

    public MyCar(Engine engine){
        this.engine = engine;
    }

    public void start (){
        engine.start();
    }
    public void stop (){
        engine.stop();
    }
    public void accelerate (){
        engine.accelerate();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }

    public void upgrade (Engine engine){
        this.engine = engine;
    }

}
