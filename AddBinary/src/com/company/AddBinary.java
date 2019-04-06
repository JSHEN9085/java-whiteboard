package com.company;

public class AddBinary {
    public static String addBinary(String a, String b){
       StringBuilder result = new StringBuilder();
       int i = a.length() - 1;
       int j = b.length() - 1;
       int carry = 0;

       while(i >= 0 || j >= 0){
           int sum = carry;

           if(i >= 0){
               System.out.println(i);
               sum += a.charAt(i--) - '0';
           }

           if(j >= 0){
               sum += b.charAt(j--) - '0';
           }

           result.insert(0, sum % 2);
           carry = sum / 2;
       }

       if(carry > 0){
           result.insert(0, 1);
       }
       return result.toString();
    }
}


//hits: char for example '1' minus char '0', will left the value of that char
//this means we can get int 1 by doing '1' - '0';
