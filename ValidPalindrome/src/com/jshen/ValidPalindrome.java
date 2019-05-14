package com.jshen;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if(s == null || s.length() == 0){
            return true;
        }

        String charOnly = s.replaceAll("[^a-zA-Z]+", "").toLowerCase();
        System.out.println(charOnly);
        for(int i = 0; i < charOnly.length() / 2; i++){
            System.out.println(charOnly.charAt(i));
            if(charOnly.charAt(i) != charOnly.charAt(charOnly.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

}
