package com.amber;

public class Electric {
    public boolean moveInReady;

    public Electric(){
        this(false);
    }
    public Electric(boolean moveInReady) {
        this.moveInReady = moveInReady;
    }
    public void turnOnLights(){
        System.out.println("Lights are on");
    }


    public boolean isMoveInReady() {
        return moveInReady;
    }
}
