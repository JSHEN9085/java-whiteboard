package com.company;

import java.util.ArrayList;

public class Fibonacci {

    private static int printLimit = 200;
    private static ArrayList<Integer> fibonacci = new ArrayList<Integer>();

    public Fibonacci() {
        super();
    }

    public static void printFibonacci(){
        fibonacci.add(0);
        fibonacci.add(1);
        System.out.println(0);
        System.out.println(1);

        while(fibonacci.get(fibonacci.size() - 1) < printLimit) {
            int lastNumber = fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2);
            System.out.println(lastNumber);
            fibonacci.add(lastNumber);
        }
    }

}
