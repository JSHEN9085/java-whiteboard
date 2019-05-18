package com.jshen;


//Given an array of size n, find the majority element.
//The majority element is the element that appears more than ⌊ n/2 ⌋ times.

//Example 1:
//Input: [3,2,3]
//Output: 3

//Example 2:
//Input: [2,2,1,1,1,2,2]
//Output: 2

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Majority {

// solution 1: since the majority element will appear more than
// n/2 times, therefore the middle point must be this element
// even it is the min or max, it still has enough appearance to take the middle point
// therefore, we just sort this array and return the middle number.
//    public int majorityElement(int[] nums){
//        Arrays.sort(nums);
//        return nums[nums.length / 2];
//    }


    // solution 2:
    // tradition solution, count the appearance of each number first
    // and then find the one with more then n/2 appearance;
    public int majorityElement(int[] nums){
        Map<Integer, Integer> count = new HashMap<>();

        for(int num : nums){
            if(count.containsKey(num)){
                count.replace(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }
        }

        for (Integer num : count.keySet()){
            if(count.get(num) > nums.length / 2){
                return num;
            }
        }
        return -1;
    }

}
