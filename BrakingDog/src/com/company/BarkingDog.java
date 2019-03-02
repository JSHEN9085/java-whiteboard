package com.company;

public class BarkingDog {

    private String name;

    public BarkingDog(String name) {
        this.name = name;
    }

    public boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        if (hourOfDay >= 8 && hourOfDay <= 22){
            return false;
        } else if (isBarking && hourOfDay > 0 && hourOfDay < 24){
            return true;
        }
        return false;
    }

}
