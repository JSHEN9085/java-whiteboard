package com.company;
//X is a good number if after rotating each digit individually by
// 180 degrees, we get a valid number that is different from X.
// Each digit must be rotated - we cannot choose to leave it alone.
//
//A number is valid if each digit remains a digit after rotation.
// 0, 1, and 8 rotate to themselves; 2 and 5 rotate to each other;
// 6 and 9 rotate to each other, and the rest of the numbers do not
// rotate to any other number and become invalid.

//Example:
//Input: 10
//Output: 4
//Explanation:
//There are four good numbers in the range [1, 10] : 2, 5, 6, 9.
//Note that 1 and 10 are not good numbers, since they remain unchanged after rotating.

public class Rotation {
    public static int rotatedDigits(int N) {
        int totalGoodNum = 0;

        for (int i = 0; i <= N; i++){
            String stringNum = String.valueOf(i);
            if(stringNum.contains("3") || stringNum.contains("4") || stringNum.contains("7")){
                continue;
            } else if(stringNum.contains("2") || stringNum.contains("5") || stringNum.contains("6") || stringNum.contains("9")){
                totalGoodNum++;
            }
        }

        return totalGoodNum;
    }
}
