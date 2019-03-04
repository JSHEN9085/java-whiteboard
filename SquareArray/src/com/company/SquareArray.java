package com.company;
import java.util.Arrays;

//Given an array of integers A sorted in non-decreasing order,
//return an array of the squares of each number,
// also in sorted non-decreasing order.

//Input: [-4,-1,0,3,10]
//Output: [0,1,9,16,100]

//Input: [-7,-3,2,3,11]
//Output: [4,9,9,49,121]

public class SquareArray {
    public static int[] sortedSquares(int[] A) {
        int[] newArray = new int[A.length];
        for (int i = 0; i < A.length; i++){
            newArray[i] = A[i] * A[i];
        }
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
}
