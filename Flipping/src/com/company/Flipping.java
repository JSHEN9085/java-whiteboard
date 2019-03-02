package com.company;

import java.util.ArrayList;
import java.util.List;

public class Flipping {

    public static int[][] flipAndInvertImage(int[][] array) {
        for (int i = 0; i < array.length; i++){
            flipAndInvertSubArray(array[i]);
        }
        return array;
    }

    public static void flipAndInvertSubArray(int[] subArray){
        for(int i = 0; i < subArray.length / 2; i++) {
            int temp = subArray[i];
            subArray[i] = subArray[subArray.length - 1 - i];
            subArray[subArray.length - 1 - i] = temp;
        }

        for(int j = 0; j < subArray.length; j++){
            if(subArray[j] == 0){
                subArray[j] = 1;
            } else {
                subArray[j] = 0;
            }
        }
    }

}


//    public static int[][] flipAndInvertImage(int[][] A){
//        if (A == null || A.length < 1 || A[0].length < 1) return A;
//        int m = A.length, n = A[0].length;
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n / 2; j++) {
//                int temp = A[i][j];
//                A[i][j] = A[i][n - 1 - j] ^ 1;
//                A[i][n - 1 - j] = temp ^ 1;
//            }
//            if (n % 2 != 0) {
//                A[i][n / 2] ^= 1;
//            }
//        }
//        return A;
//
//    }