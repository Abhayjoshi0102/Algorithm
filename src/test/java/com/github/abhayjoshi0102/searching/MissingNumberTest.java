package com.github.abhayjoshi0102.searching;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Test class for com.github.abhayjoshi0102.searching.MissingNumber
 */
public class MissingNumberTest extends TestCase{
    public MissingNumberTest(String test) {
        super(test);
    }

    public static Test suite() {
        return new TestSuite(com.github.abhayjoshi0102.searching.MissingNumberTest.class );
    }

    public void testMissingNumber() {
        int [] array = {4,5,6,2,3};
        assertEquals(1,MissingNumber.bruteForce(array));
        assertEquals(1,MissingNumber.bucketSort(array));
        assertEquals(1,MissingNumber.mathematicalMethod(array));
        assertEquals(1,MissingNumber.mathematicalApproachWithBigInteger(array));
        assertEquals(1,MissingNumber.usingXorMethod(array));
        array = new int [] {1,2,3,4};
        assertEquals(-1,MissingNumber.bruteForce(array));
        assertEquals(-1,MissingNumber.bucketSort(array));
        assertEquals(-1,MissingNumber.mathematicalMethod(array));
        assertEquals(-1,MissingNumber.mathematicalApproachWithBigInteger(array));
        assertEquals(-1,MissingNumber.usingXorMethod(array));
    }
}
