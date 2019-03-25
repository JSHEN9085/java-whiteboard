package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
//determine if the input string is valid.
//An input string is valid if:
//Note that an empty string is also considered valid.

//Example 1:
//Input: "()"
//Output: true
//
//Example 2:
//Input: "()[]{}"
//Output: true
//
//Example 3:
//Input: "(]"
//Output: false
//
//Example 4:
//Input: "([)]"
//Output: false


public class Parentheses {
    public static boolean isValid(String string) {
        if(string == null || string.length() == 0){
            return true;
        }

        Stack<Character> parentheses = new Stack<>();
        for (Character character : string.toCharArray()){
            if(character == '('){
                parentheses.push(')');
            } else if(character == '['){
                parentheses.push(']');
            } else if(character == '{'){
                parentheses.push('}');
            } else {
                if(parentheses.isEmpty() || parentheses.pop() != character){
                    return false;
                }
            }
        }
        System.out.println(parentheses);
        return parentheses.isEmpty();
    }
}
