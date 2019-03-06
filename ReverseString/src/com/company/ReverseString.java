package com.company;

//Write a function that reverses a string. The input string
// is given as an array of characters char[].
//Do not allocate extra space for another array, you must
//do this by modifying the input array in-place with O(1) extra memory.
//You may assume all the characters consist of printable
// ascii characters.

//Input: ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]

public class ReverseString {
    public void reverseString(char[] s) {
        for(int i = 0; i < s.length / 2; i++){
            // loop only up to the half of the array, otherwise
            // it will switch back to the original!!!;
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }
}
