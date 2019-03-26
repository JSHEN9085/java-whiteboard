package com.company;

//given a int 123456, take the first digit first and then the last digit
//finally return an int 162534

public class ShuffledNum {
    public static int shuffledNum(int number){
        StringBuilder result = new StringBuilder();

        char[] charNumber = Integer.toString(number).toCharArray();
        for (int i = 0; i <= charNumber.length / 2; i++){
            result.append(charNumber[i]);
            result.append(charNumber[charNumber.length - 1 - i]);
        }

        if(charNumber.length % 2 != 0){
            result.setLength(result.length() - 1);
        } //without this part 12345 will return 152433; !!!

        return Integer.parseInt(result.toString());
    }
}
