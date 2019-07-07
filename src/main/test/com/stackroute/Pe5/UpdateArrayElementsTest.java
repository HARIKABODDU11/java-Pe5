package com.stackroute.Pe5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class UpdateArrayElementsTest {

    UpdateArrayElements updateArrayElements;

    @Before
    public void setUp() {
        updateArrayElements = new UpdateArrayElements();
    }

    @After
    public void tearDown() {
        updateArrayElements = null;
    }

    @Test
    public void givenStringContainsArrayShouldReturnUpdated() {
        ArrayList<String> actual = new ArrayList();
        actual.add("Apple");
        actual.add("Grape");
        actual.add("Melon");
        actual.add("Berry");

        ArrayList<String> expected = new ArrayList();
        expected.add("Kiwi");
        expected.add("Grape");
        expected.add("Melon");
        expected.add("Berry");

        ArrayList result = updateArrayElements.updateElements(0, "Kiwi", actual);
        assertEquals(expected, result);

    }

    @Test
    public void givenStringContainsEmptyShouldReturnErrorMessage() {
        ArrayList<String> actual1 = new ArrayList();


        ArrayList result = updateArrayElements.updateElements(0, "Kiwi", actual1);
        assertEquals(null, result);

    }
}