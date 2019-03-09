package com.company;

//This problem was asked by Uber.
//
//Given an array of integers, return a new array such that each element
//at index i of the new array is the product of all the numbers in the
//original array except the one at i.

//For example, if our input was [1, 2, 3, 4, 5], the expected output
// would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the
// expected output would be [2, 3, 6].

public class Product {

    //1. without division and time complexity in O(n)
    public static int[] getProductExceptSelf(int[] nums){
        int numsLength = nums.length;
        int[] left = new int[numsLength];
        int[] right = new int[numsLength];

        left[0] = 1;
        for(int i = 1; i < numsLength; i++){
            left[i] = left[i - 1]*nums[i -1];
        }

        right[numsLength - 1] = 1;
        for(int i = numsLength - 2; i >= 0; i--){
            right[i] = right[i + 1]*nums[i + 1];
        }

        int[] result = new int[numsLength];
        for(int i = 0; i < numsLength; i++){
            result[i] = left[i]*right[i];
        }
        return result;
    }
//========================================================================
//    Let's try to calculate a left product array, such that for left[i] = the product of everything to the left of nums[i], using this example ([1,2,3,4]).
//
//    left[0] = 1 (There is nothing to the left of nums[0], so we set it to 1)
//    left[1] = 1 (1 is to the left of nums[0], so we set it to 1)
//    left[2] = 1 * 2
//    left[3] = 1 * 2 * 3
//
//    Look for the pattern in those products (There's a pattern here!)
//    left[1] = 1 = left[0] * 1 = left[0] * nums[0]
//    left[2] = 1 * 2 = left[1] * 2 = left[1] * nums[1]
//    left[3] = 1 * 2 * 3 = left[2] * 3 = left[2] * nums[2]
//
//    The pattern: left[i] = left[i-1] * nums[i-1] !!!
//
//    We can show a similar situation for the right product array-> right[i] = right[i+1] * nums[i+1]
//========================================================================


    //2. without any restriction, time complexity in O(2n)
//    public static int[] getProductExceptSelf(int[] nums){
//        int product = 1;
//        for(int num : nums){
//            product *= num;
//        }
//
//        int[] result = new int[nums.length];
//
//        for(int i = 0; i < result.length; i++){
//            result[i] = product / nums[i];
//        }
//        return result;
//    }
}
