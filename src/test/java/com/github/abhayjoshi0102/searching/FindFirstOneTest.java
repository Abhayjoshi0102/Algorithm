package com.github.abhayjoshi0102.searching;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * Test com.github.abhayjoshi0102.searching.FindFirstOne class.
 */

public class FindFirstOneTest extends TestCase {
    public FindFirstOneTest(String testCase) {
        super(testCase);
    }

    public static Test suite() {
        return new TestSuite(com.github.abhayjoshi0102.searching.FindFirstOneTest.class );
    }

    public void testFindFirstOne() {
        int [] array = {0,0,0,0,0,0};
        assertEquals(-1,FindFirstOne.linearSearch(array));
        assertEquals(-1,FindFirstOne.binarySearch(array));
        array = new int [] {0};
        assertEquals(-1,FindFirstOne.linearSearch(array));
        assertEquals(-1,FindFirstOne.binarySearch(array));
        array = new int [] {1};
        assertEquals(0,FindFirstOne.linearSearch(array));
        assertEquals(0,FindFirstOne.binarySearch(array));
        array = new int [] {1,1,1,1,1};
        assertEquals(0,FindFirstOne.linearSearch(array));
        assertEquals(0,FindFirstOne.binarySearch(array));
        array = new int [] {0,0,0,0,1};
        assertEquals(4,FindFirstOne.linearSearch(array));
        assertEquals(4,FindFirstOne.binarySearch(array));
        array = new int [] {0,0,1,1,1};
        assertEquals(2,FindFirstOne.linearSearch(array));
        assertEquals(2,FindFirstOne.binarySearch(array));
    }
}
