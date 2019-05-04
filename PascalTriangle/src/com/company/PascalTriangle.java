package com.company;
import java.util.ArrayList;
import java.util.List;

//Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
//Example:
//Input: 5
//Output:
//[
//      1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//]

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> result = new ArrayList<>(); //create a list first

        for(int i = 1; i <= numRows; i++){ //add row one by one;
            //each loop we create a new row(new list)
            List<Integer> row = new ArrayList<>(i); //ArrayList(int initialCapacity), Constructs an empty list with the specified initial capacity.
            if(i == 1){
                row.add(1);
            } else {
                row.add(1); //add 1 at the beginning;

                for(int j = 1; j < i - 1; j++){ // j is the index in previous row
                    row.add(result.get(i - 2).get(j - 1) + result.get(i - 2).get(j));
                } //most important part
                //since we assign i starting from 1 at line 21, we need to use (i - 2) to get the previous row;
                //this loop always starting adding the second number, so we assign j starting from 1, so second number at this row is the sum of the first(index 0) and second(index 1) in previous row
                //j < i - 1: i is not only the number of row, but also the length of the current row, since the first and the last number of
                //each row is always 1, we only need to iterate each row up to index (i - 2), therefore, we j should be less than i - 1;
                //we could write j < i - 1 or j <= i - 2;

                row.add(1); //add 1 at the end;
            }
            result.add(row);
        }
        return result;
    }
}