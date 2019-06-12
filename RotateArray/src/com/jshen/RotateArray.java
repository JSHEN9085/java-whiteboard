package com.jshen;

//Given an array, rotate the array to the right by k steps, where k is non-negative.
//Example 1:
//Input:  [1,2,3,4,5,6,7] and k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]

public class RotateArray {
    //method 1, set a new array to finish the rotation, and then assign its value back to the original input
    //not fast solution
    public void rotate(int[] nums, int k){
        //as method return "void", this mean we have to revise the original input
        //we can't set a new int[] (same length as the input) and put number into it.

        if(nums.length < 2 || k < 1 || k % nums.length == 0){
            return;
        }

        int[] result = new int[nums.length];

        for(int i = 0; i < result.length; i++){
            result[(i + k) % result.length] = nums[i];
        }

        for(int j = 0; j < nums.length; j++){
            nums[j] = result[j];
        }
    }
}
