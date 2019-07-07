package com.stackroute.Pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCountTest {
    StringCount stringCount;
    @Before
    public void setUp() throws Exception {
        stringCount=new StringCount();
    }

    @After
    public void tearDown() throws Exception {
        stringCount=null;
    }

    @Test
    public void checkFrequency() {
        String expected="{one=5, two=2, three=2}";
        String actual=stringCount.checkFrequency("one one-one___two,,three,one @three*one?two");
        assertEquals(expected,actual);
    }

    @Test
    public void checkFrequencyNull() {

        String actual=stringCount.checkFrequency(null);
        assertNull(actual);
    }
    @Test
    public void checkFrequencyNotNull() {

        String actual=stringCount.checkFrequency("i am Batman");
        assertNotNull(actual);
    }
}