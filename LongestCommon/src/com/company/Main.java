package com.company;

public class Main {

    public static void main(String[] args) {
	    String string1 = "abcdefg";
        System.out.println(string1.substring(0, 6)); //begin index means including, end index is excluding

        String string2 = "123abc";
        System.out.println(string1.indexOf(string2));
    }
}
