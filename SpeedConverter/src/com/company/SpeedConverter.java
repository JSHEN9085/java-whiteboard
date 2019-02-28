package com.company;

public class SpeedConverter {

    public static void main(String[] args) {
        fromKMPerHourToMilePerHour(35.78);
    }

    public static String fromKMPerHourToMilePerHour(Double kmPerHour){
        double mph = Math.round(kmPerHour / 1.60);
        String mphString = String.valueOf(mph);
        System.out.println("Car is running at " + mphString + " mph");
        return "Car is running at " + mphString + " mph";
    }
}
