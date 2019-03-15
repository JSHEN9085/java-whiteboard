package com.company;
import java.util.HashMap;

//  Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000

//Example 1:
//Input: 3
//Output: "III"
//
//Example 2:
//Input: 4
//Output: "IV"
//
//Example 3:
//Input: 9
//Output: "IX"
//
//Example 4:
//Input: 58
//Output: "LVIII"
//Explanation: L = 50, V = 5, III = 3.

//Given an integer, convert it to a roman numeral. Input is
//guaranteed to be within the range from 1 to 3999.

import java.util.HashMap;

public class NumberRoman {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < values.length; i++){
            while(num >= values[i]){
                result.append(romans[i]);
                num -= values[i];
            }
        }
        return result.toString();
    }
}
