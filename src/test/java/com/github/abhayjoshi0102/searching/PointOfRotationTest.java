package com.github.abhayjoshi0102.searching;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class PointOfRotationTest extends TestCase {
    public PointOfRotationTest(String testCase) {
        super(testCase);
    }

    public static Test suite() {
        return new TestSuite(com.github.abhayjoshi0102.searching.PointOfRotationTest.class );
    }

    public void testPointOfRotationTest() {
        int [] array = { 1,2,3,4,5,6};
        assertEquals(-1,PointOfRotation.linearMethod(array));
        assertEquals(-1,PointOfRotation.binaryMethod(array));
        array = new int [] {};
        assertEquals(-1,PointOfRotation.linearMethod(array));
        assertEquals(-1,PointOfRotation.binaryMethod(array));
        array = new int [] {5,6,8,1,2,3,4};
        assertEquals(2,PointOfRotation.linearMethod(array));
        assertEquals(2,PointOfRotation.binaryMethod(array));
        array = null;
        assertEquals(-1,PointOfRotation.linearMethod(array));
        assertEquals(-1,PointOfRotation.binaryMethod(array));
    }
}
