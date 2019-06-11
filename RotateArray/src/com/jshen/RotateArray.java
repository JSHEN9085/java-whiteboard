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
    public void rotate(int[] nums, int k){
        //as method return "void", this mean we have to revise the original input
        //we can't set a new int[] (same length as the input) and put number into it.

        if(nums.length < 2 || k < 1 || k % nums.length == 0){
            return;
        }

        int i = 0;

        while(i < nums.length){
            int newIndex = (i + k) % nums.length;
            int tem = nums[newIndex];
            nums[newIndex] = nums[i];
            nums[(newIndex + k) % nums.length] = tem;
            i++;
        }
    }
}
