package com.company;

public class Main {

    private static int[] array1 = {1,2,3,0,0,0};
    private static int[] array2 = {2,5,6};

    public static void main(String[] args) {
        System.out.println(MergeSortedArray.merge(array1, 3, array2, 3));
    }
}
