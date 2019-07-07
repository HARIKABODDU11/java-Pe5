package com.stackroute.Pe5;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;


    public class SorterSetTest {

        public static SorterSet sorterSet;

        @BeforeClass
        public static void setUp() {
            sorterSet = new SorterSet();

        }

        @AfterClass
        public static void tearDown() {
            sorterSet = null;
        }

        @Test
        public void givenArrayShouldReturnSortedMap() {
            ArrayList<String> result = new ArrayList<>();
            result.add("America");
            result.add("Harika");
            result.add("Polonica");
            result.add("potter");
            assertEquals(result, sorterSet.sort(new String[] {"potter","America","Polonica","Harika"}));
        }


        @Test
        public void givenNullShouldReturnNull() {
            assertNull(sorterSet.sort(null));
        }

        @Test
        public void givenIntegersArrayShouldReturnSortedMap() {
            ArrayList<String> result = new ArrayList<>();
            result.add("1");
            result.add("2");
            result.add("3");
            result.add("76");
            result.add("a");
            assertEquals(result, sorterSet.sort(new String[] {"3","2","76","1","a"}));
        }


    }
