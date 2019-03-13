package com.company;

//!!!note: math operation is faster than creating new class(String)
//even creating String only iterate half of the stringNum; !!!

public class PalindromeNum {
    public static boolean isPalindrome(int num) {
        if(num < 0){
            return false;
        }

        int originalNum = num;
        int reversedNum = 0;
        while(originalNum > 0){
            reversedNum = reversedNum*10 + originalNum % 10;
            originalNum /= 10;
        }
        return reversedNum == num;
    }

//    public static boolean isPalindrome(int num) {
//        if(num < 0){
//            return false;
//        }
//
//        String stringNum = String.valueOf(num);
//        for(int i = 0; i < stringNum.length() / 2; i++){
//            if(stringNum.charAt(i) != stringNum.charAt(stringNum.length() - 1 - i)){
//                return false;
//            }
//        }
//        return true;
//    }
}
