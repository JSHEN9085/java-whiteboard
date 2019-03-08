package com.company;

//A matrix is Toeplitz if every diagonal from top-left to bottom-right
// has the same element.
//Now given an M x N matrix, return True if and only if the matrix is
//Toeplitz.

//Input:
//matrix = [
//[1,2,3,4],
//[5,1,2,3],
//[9,5,1,2]
//]
//Output: True
//Explanation:
//In the above grid, the diagonals are:
//"[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
//In each diagonal all elements are the same, so the answer is True.

public class Toeplitz {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++){
            for(int j = 0; j < matrix[i].length - 1 ; j++){
                if(matrix[i][j] != matrix[i + 1][j + 1]){
                    return false;
                }
            }
        }
        return true;
    }
}

//note:
//line 22: matrix.length - 1, we don't need to compare the base array,
//because it is being compared in the loop;

//line 23: matrix[i].length - 1, for each sub array, we only iterate
//up to the 2nd last number of current array, and compare to the last
//number of the next array. So, for the current floor, we never need to
//go to the very end;

//if we set "< matrix.length" and "<matrix[i].length", we will have error
//exception regarding the index, since i + 1 and j + 1 are invalid; 
