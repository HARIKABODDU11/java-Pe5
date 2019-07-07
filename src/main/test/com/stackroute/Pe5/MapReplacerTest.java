package com.stackroute.Pe5;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

    public class MapReplacerTest {


        public static MapReplacer mapReplacer;

        @BeforeClass
        public static void setUp()
        {
            mapReplacer = new MapReplacer();
        }

        @AfterClass
        public static void tearDown()
        {
            mapReplacer = null;
        }

        @Test
        public void givenMapShouldReturnReplacedMap()
        {
            Map<String,String> inputMap = new HashMap<>();
            inputMap.put("val1","java");
            inputMap.put("val2","python");


            Map<String,String> resultMap = new HashMap<>();
            resultMap.put("val2","");
            resultMap.put("val1","python");


            assertEquals(resultMap, mapReplacer.replaceMapValues(inputMap));
        }

        @Test
        public void givenMapWithDifferentShouldReturnReplacedMap()
        {
            Map<String,String> inputMap = new HashMap<>();
            inputMap.put("1","111");
            inputMap.put("2","222");
            inputMap.put("3","333");

            Map<String,String> resultMap = new HashMap<>();
            resultMap.put("1","");
            resultMap.put("2","111");
            resultMap.put("3","222");

            assertEquals(resultMap, mapReplacer.replaceMapValues(inputMap));
        }

        @Test
        public void givenNullShouldReturnNull()
        {
            assertNull(mapReplacer.replaceMapValues(null));
        }
    }
