package com.company;
//Given an array of integers, return indices of the two numbers such
// that they add up to a specific target.
//You may assume that each input would have exactly one solution,
// and you may not use the same element twice.
//Given nums = [2, 7, 11, 15], target = 9,
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1]. return the index of the number, instead of their value!!!

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        if(nums == null || nums.length == 0){
            return result;
        }

        HashMap<Integer, Integer> visited = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(visited.containsKey(complement)){
                result[0] = visited.get(complement); //(key) use the key to get the value
                result[1] = i;
                return result;
            }
            visited.put(nums[i], i);
        }
        return result;
    }
}
