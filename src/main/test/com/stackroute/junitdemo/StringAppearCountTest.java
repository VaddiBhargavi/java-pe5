package com.stackroute.junitdemo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;

public class StringAppearCountTest {
    StringAppearCount stringAppearCount;

        @Before
        public void setUp(){
            stringAppearCount=new StringAppearCount();
        }

        @After
        public void tearDown(){
        }

        @Test
        public void checkOccurrenceCorrect1(){
            String  arr[] ={"a","b","c","d","a","c","c"};
            Map<String,Boolean> mp=new HashMap<String,Boolean>();
            mp.put("a",true);
            mp.put("b",false);
            mp.put("c",true);
            mp.put("d",false);
            assertEquals(mp,stringAppearCount.checkOccurrence(arr));
        }

        @Test
        public void checkOccurrenceCorrect2(){
            String  arr[] ={"a","b","c","d","a","c","c","d","e"};
            Map<String,Boolean> mp=new HashMap<String,Boolean>();
            mp.put("a",true);
            mp.put("b",false);
            mp.put("c",true);
            mp.put("d",true);
            mp.put("e",false);
            assertEquals(mp,stringAppearCount.checkOccurrence(arr));
        }
    @Test
    public void checkOccurrenceCorrect3(){
        String  arr[] ={ };
        Map<String,Boolean> mp=new HashMap<String,Boolean>();
        assertEquals(mp,stringAppearCount.checkOccurrence(arr));
    }
    }


