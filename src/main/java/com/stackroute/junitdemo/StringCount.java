package com.stackroute.junitdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCount {
    public Map<String,Integer> frequencyOfWords(String input) {
        int result = 0;
        //str = "one one -one___two,,three,one @three*one?two";
        if(input == null || input == " ")
        {
            return null;
        }
        String oneWord = "one";
        String twoWord = "two";
        String threeWord = "three";
        //Checks for the pattern
        Pattern pattern1 = Pattern.compile(oneWord);
        Pattern pattern2 = Pattern.compile(twoWord);
        Pattern pattern3 = Pattern.compile(threeWord);
        //Matches with the pattern
        Matcher matcher1 = pattern1.matcher(input);
        Matcher matcher2 = pattern2.matcher(input);
        Matcher matcher3 = pattern3.matcher(input);
        int number1 = 0, number2 = 0, number3 = 0;
        while (matcher1.find()) {
            result = number1++;
        }
        while (matcher2.find()) {
            result = number2++;
        }
        while (matcher3.find()) {
            result = number3++;
        }
        Map<String, Integer> str = new HashMap<String, Integer>();
        str.put("one", number1);
        str.put("two", number2);
        str.put("three", number3);
    return str;
    }
}
