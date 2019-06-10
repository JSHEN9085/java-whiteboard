package com.jshen;

//given a string, return true if every character in this string is unique

import java.util.HashSet;
import java.util.Set;

public class UniqueChar {
    public static boolean isUnique(String input){
        if(input == null || input.length() == 0){
            return true;
        }

        Set<Character> visited = new HashSet<>();
        for(Character letter : input.toCharArray()){
            if(visited.contains(letter)){
                return false;
            } else {
                visited.add(letter);
            }
        }
        return true;
    }
}
