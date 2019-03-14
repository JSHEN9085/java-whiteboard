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
//Input: "III"
//Output: 3

//Example 2:
//Input: "IV"
//Output: 4

//Example 3:
//Input: "IX"
//Output: 9

//Example 4:
//Input: "LVIII"
//Output: 58
//Explanation: L = 50, V= 5, III = 3.

public class RomanNumber {

    public int romanToInt(String stringNum) {
        HashMap<Character, Integer> romanNumber = new HashMap<>();
        romanNumber.put('I', 1);
        romanNumber.put('V', 5);
        romanNumber.put('X', 10);
        romanNumber.put('L', 50);
        romanNumber.put('C', 100);
        romanNumber.put('D', 500);
        romanNumber.put('M', 1000);

        int result = 0;
        int currentLevel = 0;

        for(int i = stringNum.length() - 1; i >= 0; i--){
            int digit = romanNumber.get(stringNum.charAt(i));
            if(digit >= currentLevel){
                result += digit;
            } else {
                result -= digit;
            }
        }
        return result;
    }

}

//For Roman Number conversion, the best way is iterate the string from right to left
//if left > right, we add the number to the total,
//if left <= right, we deduct the number from the total.