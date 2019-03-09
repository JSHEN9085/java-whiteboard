package com.company;

import java.util.Arrays;

public class Main {
    private static int[] array = {10, 3, 5, 6, 2};

    public static void main(String[] args) {
	    int[] result = Product.getProductExceptSelf(array);
        System.out.println(Arrays.toString(result));
    }
}
