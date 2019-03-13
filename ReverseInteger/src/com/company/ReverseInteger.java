package com.company;
//Example 1:
//        Input: 123
//        Output: 321

//Example 2:
//        Input: -123
//        Output: -321

//Example 3:
//        Input: 120
//        Output: 21

//Assume we are dealing with an environment which could only store
//integers within the 32-bit signed integer range: [−2^31,  2^31 − 1].
//the trick is our number can't sit outside this range.

public class ReverseInteger {

    public static int reverse(int num){
        long result = 0; //in case our number is outside the range, we need to declare it as long;
        while(num != 0){
            result = result*10 + num % 10;
            num /= 10;

            if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE){
                return 0;
            }
        }
        return (int)result;
    }
}
