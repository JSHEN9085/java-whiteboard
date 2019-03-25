package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	    String example = "abcdefg";

        System.out.println(example.charAt(0)); //return 'a';
        System.out.println(example.toCharArray()); //return abcdefg with array format
        System.out.println(example.toCharArray()[1]); //return 'b';

        Stack<Character> stack = new Stack<>();
        System.out.println(stack.push('a'));
        System.out.println(stack.push('b')); //push will return the element you push in;
        System.out.println("before stack.pop() " + stack); // return [a, b]
        System.out.println(stack.pop()); // pop will return the element you pop out;
        System.out.println("after stack.pop() " + stack); // return [a]

    }
}
