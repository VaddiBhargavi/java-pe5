package com.stackroute.junitdemo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringAppearCount {
    public Map<String, Boolean> checkOccurrence(String[] input) {

        Map<String, Boolean> resultMap = new HashMap<>();

        if (input == null) {
            return null;
        }
        else {
            for (int i = 0; i < input.length; i++) {

                String word = input[i];
                if (resultMap.containsKey(word))
                    resultMap.put(word, true);
                else
                    resultMap.put(word, false);
            }
            return resultMap;
        }
    }
}


