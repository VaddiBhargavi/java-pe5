package com.stackroute.junitdemo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static org.junit.Assert.*;


    public class SetSortingTest {
        SetSorting setSorting;

        @Before
        public void setUp(){
            setSorting=new SetSorting();
        }

        @After
        public void tearDown() {
            setSorting=null;
        }
        @Test
        public void givenSetShouldPrintSortedSet() {
           // List<String> actualList = new ArrayList<>();
            Set<String> set = new HashSet<>();
            set.add("Harry");
            set.add("Olive");
            set.add("Alice");
            set.add("Bluto");
            set.add("Eugene");

            List<String> expectedList = new ArrayList<>();
            List<String> actualList = setSorting.sortedSetMethod(set);
            expectedList.add("Alice");
            expectedList.add("Bluto");
            expectedList.add("Eugene");
            expectedList.add("Harry");
            expectedList.add("Olive");
            assertEquals(expectedList, actualList);
        }
        @Test
        public void givenInputNullReturnNull()
        {
            List<String> actualList = new ArrayList<>();
            Set<String> set = new HashSet<>();
            actualList = setSorting.sortedSetMethod(set);
            List<String> expectedList = new ArrayList<>();
            assertEquals(expectedList,actualList);
        }
    }

