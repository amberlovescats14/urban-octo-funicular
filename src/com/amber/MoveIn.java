package com.amber;

public class MoveIn {
    private String familyName;

    public MoveIn(String familyName) {
        this.familyName = familyName;
    }

    public void welcome(){
        System.out.println("Welcome to your new house, " + familyName  + " family!");
    }
}
