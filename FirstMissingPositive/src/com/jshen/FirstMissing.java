package com.jshen;

import java.util.Arrays;

public class FirstMissing {

    //
    public int firstMissingPositive(int[] nums) {
        if(nums == null || nums.length == 0) return 1;

        for(int i = 0; i < nums.length; i++){
            //main idea of nums[nums[i] - 1] != nums[i], each num should be at the correct position
            //for the best case [1, 2, 3, 4], when i loop to 2, num[i] is 3, and nums[nums[i] - 1] will be nums[3 - 1] == nums[2] == 3
            while(nums[i] > 0 && nums[i] < nums.length && nums[nums[i] - 1] != nums[i]){
                int tem = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = tem;
            }
        }

        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                return j + 1;
            }
        }
        return nums.length + 1; //if array is in perfect form [1, 2, 3, 4, 5], it is missing 6, so return length + 1
    }
}

//example:
//[-2, 4, -1, 3, 7]  expected out put is 1;
//1st loop: i = 0, nums[i] < 0, skip swapping
//2nd loop: i = 1, nums[i] > 0, nums[i] < nums.length, and nums[nums[i] - 1] = num[3] != num[1], or 3 != 4; swap it. array is [-2, 3, -1, 4, 7]
//still in 2nd loop, i = 1; nums[i] > 0, nums[i] < nums.length nums[nums[i] - 1] = num[2] != num[1], or -1 != 3, swap it. array is [-2, -1, 3, 4, 7]
//run 2nd loop again, i = 1, nums[i] is -1 now, so skip the swap
//3rd loop: i = 2, nums[i] > 0, nums[i] < nums.length, and nums[nums[i] - 1] = nums[2] = nums[2], skip the swap; array unchanged [-2, -1, 3, 4, 7]
//4th loop: i = 3, nums[i] > 0, nums[i] < nums.length, and nums[nums[i] - 1] = nums[3] = nums[3], skip the swap; array unchanged [-2, -1, 3, 4, 7]
//5th loop: i = 4, nums[i] > 0, but nums[i] > nums.length, skip the swap.
//loop finished

//nums is swapped as [-2, -1, 3, 4, 7]
//for loop again
//1st loop: j = 0, nums[0] != -2 + 1, return j + 1;
//the main point of 1st for loop(with while loop inside) is to put every positive value into the current position
//for example, 2 should be sitting at index 1, 4 is sitting at index 3.
//after swapping, if value != index + 1, that means this array is missing value of index + 1, so we return index + 1, that is j + 1 there