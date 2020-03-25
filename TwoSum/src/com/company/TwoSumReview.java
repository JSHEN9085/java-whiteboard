package com.company;

import java.util.HashMap;

public class TwoSumReview {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> visited = new HashMap<>(); //using a hashmap to store difference and the index of number that has this difference to the target
        for(int i = 0; i < nums.length; i++){
            if(visited.get(nums[i]) != null){
                return new int[]{visited.get(nums[i]), i};
            } else {
                visited.put(target - nums[i], i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

//note:
//below was version 1, I made a new int[] at the beginning, but this will slow
//down the program, so I could direct assign an array when needed, no need to
//declare it at the very beginning.

//int[] solution = new int[2]; //new array to present solution
//
//    HashMap<Integer, Integer> visited = new HashMap<>(); //using a hashmap to store difference and the index of number that has this difference to the target
//        for(int i = 0; i < nums.length; i++){
//        if(visited.get(nums[i]) != null){
//        solution[0] = visited.get(nums[i]);
//        solution[1] = i;
//        } else {
//        visited.put(target - nums[i], i);
//        }
//        }
//        return solution;