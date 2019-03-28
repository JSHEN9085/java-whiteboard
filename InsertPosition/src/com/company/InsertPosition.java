package com.company;

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
