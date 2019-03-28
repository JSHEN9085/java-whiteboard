package com.company;
//Given a sorted array and a target value, return the index if
//the target is found. If not, return the index where it
//would be if it were inserted in order.
//You may assume no duplicates in the array.

//Input: [1,3,5,6], 5
//Output: 2
//
//Input: [1,3,5,6], 7
//Output: 4
//
//Input: [1,3,5,6], 0
//Output: 0

public class InsertPosition {
    public static int searchInsert(int[] nums, int target){
        int head = 0;
        int tail = nums.length;
        int middle = (head + tail) / 2;

        if(target < nums[0]) {
            return 0;
        }

        while(nums[middle] != target){
            if(nums[middle] > target && tail - head != 1){
                tail = middle;
                middle = (head + tail) / 2;
            } else if(nums[middle] < target && tail - head != 1){
                head = middle;
                middle = (head + tail) / 2;
            } else if(tail - head == 1){
                return tail;
            } else {
                return middle;
            }
        }
        return middle;
    }
}
