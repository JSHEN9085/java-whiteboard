package com.company;

//Given a list of numbers and a number k, return the unique
//combination of two numbers from the list add up to k.
//assume each number will appear once in the array;

//For example, given [10, 15, 3, 7] and k of 17, return [10, 7] since
// 10 + 7 is 17.

import java.util.HashSet;
import java.util.Set;

public class TwoSumReturnValue {
    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];

        if(nums == null || nums.length == 0){
            return result;
        }

        Set<Integer> visited = new HashSet<>();
        for(int num : nums){
            int complement = target - num;
            if(visited.contains(complement)){
                result[0] = complement;
                result[1] = num;
                return result;
            }
            visited.add(num);
        }
        return result;
    }
}
