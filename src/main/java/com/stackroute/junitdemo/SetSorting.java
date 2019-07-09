package com.stackroute.junitdemo;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SetSorting {

    public ArrayList<String> sortedSetMethod(Set<String> input)
    {
        //If input is null
        if(input == null)
        {
            return null;
        }
        else {
            //Sorts the list and converted to array list
            TreeSet<String> treeSet = new TreeSet<>(input);
            ArrayList<String> sortedList = new ArrayList<>(treeSet);
            return sortedList;
        }
    }
}

