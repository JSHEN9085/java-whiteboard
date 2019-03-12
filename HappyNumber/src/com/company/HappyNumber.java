package com.company;

//A happy number is a number defined by the following process: Starting with
//any positive integer, replace the number by the sum of the squares of its
//digits, and repeat the process until the number equals 1 (where it will stay),
//or it loops endlessly in a cycle which does not include 1. Those numbers
//for which this process ends in 1 are happy numbers.

//Input: 19
//Output: true
//Explanation:
//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1

public class HappyNumber {

    //read the note at the bottom first
    //
    public boolean isHappy(int num){
        while(true){
            if(num == 1){ //this is the condition we want;
                return true;
            }

            if(num == 4){ //this is the condition with single digit in the infinity loop(non-happyNumber);
                return false;
            }

            num = digitSum(num); //digitSum of current input, and then assign the result to the next round of loop; 
        }
    }

    //digitSum will calculate the sum of all digit^2
    public int digitSum(int num){
        int sum = 0;
        while(num != 0){
            sum +=  (num % 10) * (num % 10); // %10 will get the last digit, and then we add lastDigit^2 to the sum;
            num /= 10; //after adding lastDigit^2 to the sum, we divide the number by 10 (19 / 10 = 10) to remove the lastDigit
        }
        return sum;
    }
}

//note: in math
//Numbers that are happy follow a sequence that ends in 1.
// All unhappy numbers follow sequences that eventually
// reach the eight-number cycle
//4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4 → ...
//That is why we check if the sum = 4 at line 25;