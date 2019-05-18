package com.jshen;

import java.util.HashMap;
import java.util.Map;

//Given a positive integer, return its corresponding column title as appear in an Excel sheet.
//For example:

//1 -> A
//2 -> B
//3 -> C
//...
//26 -> Z
//27 -> AA
//28 -> AB
//...

public class ExcelColumn {
    public static String convertToTitle(int n){
        char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        if(n < 27){
            return Character.toString(letters[n - 1]);
        } else {
            StringBuilder result = new StringBuilder();
            result.append(letters[(n / 26) - 1]);
            result.append(letters[(n % 26) - 1]);
            return result.toString();
        }
    }
}
