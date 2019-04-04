package com.company;

//Given an integer array nums, find the contiguous subarray
//(containing at least one number) which has the
//largest sum and return its sum.

//Example:
//Input: [-2,1,-3,4,-1,2,1,-5,4],
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.

public class MaxSubarray {
    public static int maxSubArray(int[] nums){
        if(nums.length == 0) {
            return 0;
        }

        int maximumSum = nums[0];
        int temporarySum = 0;

        for (int num : nums){
            temporarySum += num;
            if(temporarySum > maximumSum){
                maximumSum = temporarySum;
            }

            if(temporarySum < 0){
                temporarySum = 0; //this is the key step for this solution
                // ex: [1, 2, -1, 30], if the portion before a great number come up with positive sum, it is make sense to add them together, the sum is still greater than the great number;
                // ex: [1, 2, -8, 30], if the portion before a great number come up with negative sum, we just forget that portion, reset temporarySum = 0, and start a new count;
            }
        }
        return maximumSum;
    }
}
