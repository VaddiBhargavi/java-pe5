package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringCountTest {
    StringCount stringCount;
    @Before
    public void setUp() {
        stringCount =new StringCount();
    }

    @After
    public void tearDown() {
        stringCount=null;
    }
@Test
    public void givenStringShouldReturnCountOfWords()
{
    String str= "one one -one___two,,three,one @three*one?two";
    Map<String,Integer> expected= new HashMap<String,Integer>();
    expected.put("one",5);
    expected.put("two",2);
    expected.put("three",2);
    Map actual = stringCount.frequencyOfWords(str);
    assertEquals(expected,actual);
}
    @Test
    public void givenStringIsNullShouldReturnError()
    {
        Map<String,Integer> result= new HashMap<String, Integer>();
        result= stringCount.frequencyOfWords(null);
        assertEquals("Enter valid String",result);
    }
}