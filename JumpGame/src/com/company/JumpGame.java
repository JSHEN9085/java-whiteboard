package com.company;

//Given an array of non-negative integers, you are initially positioned at the first index of the array.
//Each element in the array represents your maximum jump length at that position.
//Determine if you are able to reach the last index.

//Example 1:
//Input: [2,3,1,1,4]
//Output: true
//Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

//Example 2:
//Input: [3,2,1,0,4]
//Output: false
//Explanation: You will always arrive at index 3 no matter what. Its maximum
//jump length is 0, which makes it impossible to reach the last index.

public class JumpGame {
    public boolean canJump(int[] nums){
        if(nums == null) {
            return false;
        }

        int farestWeCanGo = 0; //refer to index;
        int currentIndex = 0; //refer to index;

        while(farestWeCanGo < nums.length - 1){
            if(currentIndex > farestWeCanGo ){
                return false;
            }
            farestWeCanGo = Math.max(farestWeCanGo, currentIndex + nums[currentIndex]);
            currentIndex++;
        }
        return true;
    }
}



//key rule: for each position(index), the farestWeCanGo can't be less than
//the current position(index)
