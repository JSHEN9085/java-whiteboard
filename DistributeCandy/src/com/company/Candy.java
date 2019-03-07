package com.company;

import java.util.HashSet;
import java.util.Set;

//Given an integer array with even length, where different numbers in
//this array represent different kinds of candies. Each number means
// one candy of the corresponding kind. You need to distribute these
// candies equally in number to brother and sister. Return the maximum
// number of kinds of candies the sister could gain.

//Input: candies = [1,1,2,2,3,3]
//Output: 3
//Explanation:
//There are three different kinds of candies (1, 2 and 3), and two candies for each kind.
//Optimal distribution: The sister has candies [1,2,3] and the brother has candies [1,2,3], too.
//The sister has three different kinds of candies.

public class Candy {
    public static int distributeCandies(int[] candies){
        int max = candies.length / 2;
        Set<Integer> sistersCandies = new HashSet<>();

        for (int candy : candies){
            if(!sistersCandies.contains(candy)){
                sistersCandies.add(candy);
            }
        }

        if(sistersCandies.size() >= max){
            return max;
        }
        return sistersCandies.size();
    }
}
