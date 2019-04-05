package com.company;
import java.util.*;
import java.util.stream.*;

public class LastWordLength {
    public static int lengthOfLastWord(String s) {
        String[] stringArray = s.split(" ");
        if(stringArray.length == 0){
            return 0;
        }
        return stringArray[stringArray.length - 1].length();
    }

    public static List<String> printArray(String s){
        String[] stringArray = s.split(" ");
        List<String> stringList = new ArrayList<>();
        for (String str : stringArray){
            stringList.add(str);
        }
        System.out.println(stringList);
        System.out.println(stringList.size());
//        System.out.println(stringList.get(0));
        return stringList;
    }
}

//note need to check the length of array after split(),
//in case the input String is "        ", and array.length will be 0;