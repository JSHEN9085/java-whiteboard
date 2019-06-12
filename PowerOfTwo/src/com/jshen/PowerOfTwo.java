package com.jshen;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n){
        if(n < 1 ){
            return false;
        }
        if(n == 1){
            return true;
        }

        while(n > 1){
            if(n % 2 == 0){
                n = n / 2;
            } else {
                return false;
            }
        }
        return true;
    }
}
