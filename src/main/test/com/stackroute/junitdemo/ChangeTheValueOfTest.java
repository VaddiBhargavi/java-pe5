package com.stackroute.junitdemo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;


public class ChangeTheValueOfTest {
        ChangeTheValueOf obj;
        @Before
        public void setUp() throws Exception {
            obj=new ChangeTheValueOf();
        }
        @After
        public void tearDown() throws Exception {
        }
        @Test
        public void changeTheValueCorrect1() {
            Map<String,String> inMap=new HashMap<String, String>();
            inMap.put("val1","foobar");
            inMap.put("val2","foo");
            Map<String,String> outMap=new HashMap<String, String>();
            outMap.put("val1"," ");
            outMap.put("val2","foobar");
            assertEquals(outMap,obj.changeTheValueInTheMap(inMap));
        }
        @Test
        public void changeTheValueCorrect2() {
            Map<String,String> inMap=new HashMap<String, String>();
            inMap.put("val1","java");
            inMap.put("val2","c++");
            Map<String,String> outMap=new HashMap<String, String>();
            outMap.put("val1"," ");
            outMap.put("val2","java");
            assertEquals(outMap,obj.changeTheValueInTheMap(inMap));
        }

    }

