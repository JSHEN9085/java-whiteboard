package com.company;
import java.util.ArrayList;
import java.util.List;

//For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
//
//Also, a self-dividing number is not allowed to contain the digit zero.
//
//Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
//
//Input:
//left = 1, right = 22
//Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]

public class SelfDividing {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for (int i = left; i <= right; i++){
            if(dividingNumber(i)){
                result.add(i);
            }
        }
        return result;
    }

    public boolean dividingNumber(int num){
        for(int n = num; n > 0; n /= 10){  // 128 / 10
            if(n % 10 == 0 || num % (n % 10) != 0){
                return false;
            }
        }
        return true;
    }

    //note:
    //part 1
    //for n /= 10 at line 28 and n % 10 == 0 at line 29:
    //division rule: 13 / 10 = 1. we keep running n / 10 and then check n % 10 to
    //check if n has 0 digit. If it has its Modulus will eventually hit 0;
    //ex: 3301 -> 3301 / 10 = 330 -> 330 % 10 = 0;

    //part 2
    //check the result of 128 % (128 % 10) and then in next round of loop
    //after 128 / 10 = 12, check the result of 12 % (12 % 10), and then next round
    //after 12 / 10 = 1, then 1 % (1 % 10), after this round 1 / 10 = 0, and the loop end;
    //if the number is not self dividing, it will return non-zero in at least one of the loop
    // ***checking if the number % the remaining of number divided by 10 == 0***

    //without helper version
//    public List<Integer> selfDividingNumbers(int left, int right) {
//        List<Integer> result = new ArrayList<>();
//        for (int i = left, n = 0; i <= right; i++) {
//            for (n = i; n > 0; n /= 10){
//                if (n % 10 == 0 || i % (n % 10) != 0){
//                    break;
//                }
//            }
//            if (n == 0) {
//                result.add(i);
//            }
//        }
//        return result;
//    }
}
