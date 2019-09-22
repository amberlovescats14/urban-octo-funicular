package com.amber;

public class House {
    private Electric theElectricity;
    private Plumbing thePlumbing;
    private MoveIn movingIn;

    public House(Electric theElectricity, Plumbing thePlumbing, MoveIn movingIn) {
        this.theElectricity = theElectricity;
        this.thePlumbing = thePlumbing;
        this.movingIn = movingIn;
    }

    public void electricity() {
        theElectricity.turnOnLights();
    }

    public void plumbing(){
        thePlumbing.completionDetails();
    }

    public void greeting(){
        movingIn.welcome();
    }
}
