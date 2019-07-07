package com.stackroute.Pe5;

import static org.junit.Assert.*;


    import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class StringCount1Test {

        StringCount1 stringCount;
        @Before
        public void setUp() throws Exception {
            stringCount=new StringCount1();
        }

        @After
        public void tearDown() throws Exception {
            stringCount=null;
        }

        @Test
        public void checkAppearanceNull() {

            String actual=stringCount.checkAppearance(null);
            assertNull(actual);

        }
    @Test
    public void checkAppearance() {
        String expected="{a : true, b : false, c : true, d : false}";
        String arr[] = {"a","b","c","d","a","c","c"};
        String actual=stringCount.checkAppearance(String.join(" ",arr)).replaceAll("="," : ");
        assertEquals(expected,actual);
    }

    }
