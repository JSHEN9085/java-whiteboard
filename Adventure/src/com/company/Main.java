package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	locations.put(0, new Location(0, "You are the zero one"));
    locations.put(1, new Location(0, "You are the first one"));
    locations.put(2, new Location(2, "You are the second one"));
    locations.put(3, new Location(3, "You are the Third one"));
    locations.put(4, new Location(4, "You are the Fourth one"));
    locations.put(5, new Location(5, "You are the Fifth one"));
    locations.put(6, new Location(6, "You are the Sixth one"));

    int loc = 1;
    while(true){
        System.out.println(locations.get(loc).getDescription());
        if(loc == 0){
            break;
        }
        loc = scanner.nextInt();
        if(!locations.containsKey(loc)){
            System.out.println("You cannot go in that direction");
        }
    }
    }
}
