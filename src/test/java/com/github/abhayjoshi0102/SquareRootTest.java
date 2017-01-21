package com.github.abhayjoshi0102;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class contains the test cases for SquareRoot.java class.
 */
    public class SquareRootTest extends TestCase {
        public SquareRootTest(String testCase) {
            super(testCase);
        }

        public static Test suite() {
            return new TestSuite(SquareRootTest.class );
        }

        public void testSquareRootFirstMethod() {
            assertEquals(Math.sqrt(0),SquareRoot.getSquareRootFirstMethod(0));
            assertEquals(1,SquareRoot.getSquareRootFirstMethod(1));
            assertEquals(1,SquareRoot.getSquareRootFirstMethod(3));
            assertEquals(2,SquareRoot.getSquareRootFirstMethod(4));
            assertEquals(2,SquareRoot.getSquareRootFirstMethod(8));

        }

        public void testSquareRootSecondMethod() {
            assertEquals(0,SquareRoot.getSquareRootSecondMethod(0));
            assertEquals(1,SquareRoot.getSquareRootSecondMethod(1));
            assertEquals(1,SquareRoot.getSquareRootSecondMethod(3));
            assertEquals(2,SquareRoot.getSquareRootSecondMethod(4));
            assertEquals(2,SquareRoot.getSquareRootSecondMethod(8));
        }
}
