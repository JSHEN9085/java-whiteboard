package com.jshen;

public class ValidPalindrome {

    //with regular expression
//    public static boolean isPalindrome(String s) {
//        if(s == null || s.length() == 0){
//            return true;
//        }
//
//        String charOnly = s.replaceAll("[^a-zA-Z]+", "").toLowerCase();
//        System.out.println(charOnly);
//        for(int i = 0; i <= charOnly.length() / 2; i++){
//            if(charOnly.charAt(i) != charOnly.charAt(charOnly.length() - 1 - i)){
//                return false;
//            }
//        }
//        return true;
//    }


    //without regular expression
    public static boolean isPalindrome(String s){
        if(s == null || s.length() == 0){
            return true;
        }

        String lowerCaseString = s.toLowerCase();
        char[] letters = lowerCaseString.toCharArray();
        int l = letters.length, i = 0, j = l - 1;

        while(i < j){
            //below 2 while loops are used for skip any non-characters
            while(i < l && !Character.isLetterOrDigit(letters[i])){
                i++;
            }
            while(j >= 0 && !Character.isLetterOrDigit(letters[j])){
                j--;
            }

            //letters[i++] means after getting letters[i], we execute i++
            //same thing for letter[j--]
            if(i < j && letters[i++] != letters[j--]){
                return false;
            }
        }
        return true;
    }

}
