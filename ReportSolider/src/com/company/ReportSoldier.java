package com.company;

//given an array of soldiers' rank, each soldier is reporting
//to the solider who is one rank above him.

// example 1:
// [0, 1, 1, 2, 4]
// will return 3
// 0 can return to 1, those two 1 can report 2, but 2 is
// no need to report to 4 as the difference is greater than 1;

import java.util.HashMap;
import java.util.Map;

public class ReportSoldier {
    public static int reportSoldier(int[] ranks){
        Map<Integer, Integer> counter = new HashMap<>();
        int result = 0;

        for(int rank : ranks){
            if(counter.containsKey(rank)){
                counter.put(rank, counter.get(rank) + 1);
            } else {
                counter.put(rank, 1);
            }
        } //finish the count of soldier in different rank;

        for(int key : counter.keySet()){
            if(counter.containsKey(key + 1)){
                result += counter.get(key);
            }
        }

        return result;
    }
}
