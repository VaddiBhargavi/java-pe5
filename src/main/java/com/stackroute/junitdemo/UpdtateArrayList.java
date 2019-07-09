package com.stackroute.junitdemo;

import java.util.ArrayList;
import java.util.List;

public class UpdtateArrayList {
    public List<String> updateSpecificElements(List<String> Message, String valueOfWord, int indexOfWord) {
    String result=" ";
        if (Message.size() == 0) {
            return null;
        } else {
            Message.set(indexOfWord, valueOfWord);
            result += "Array list after removing the elements";
            return Message;
        }
    }
}


