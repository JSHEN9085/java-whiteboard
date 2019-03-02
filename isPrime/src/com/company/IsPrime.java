package com.company;

public class IsPrime {

    public IsPrime() {
        super();
    }

    public static boolean ifNumIsPrime(int number){
        if(number < 2){
            return false;
        }

        for (int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
