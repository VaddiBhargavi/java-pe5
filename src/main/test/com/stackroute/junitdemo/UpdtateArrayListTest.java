package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdtateArrayListTest {
    UpdtateArrayList updtateArrayList;
    @Before
    public void setUp() {
        updtateArrayList=new UpdtateArrayList();
    }

    @After
    public void tearDown() {
        updtateArrayList= null;
    }

    @Test
    public void updateAndClean(){
        List<String > Message=new ArrayList<String>();
        Message.add("grapes");
        Message.add("mango");
        Message.add("orange");
        Message.add("banana");
        List<String> expected=new ArrayList<String>();
        expected.add("kiwi");
        expected.add("mango");
        expected.add("orange");
        expected.add("banana");
        assertEquals(expected,updtateArrayList.updateSpecificElements(Message,"kiwi",0));
    }
}

