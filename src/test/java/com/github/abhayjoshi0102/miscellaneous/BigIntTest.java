package com.github.abhayjoshi0102.miscellaneous;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.math.BigInteger;

public class BigIntTest extends TestCase {
        public BigIntTest(String testCase) {
            super(testCase);
        }

        public static Test suite() {
            return new TestSuite(com.github.abhayjoshi0102.miscellaneous.BigIntTest.class );
        }
        public void testBigInt() {
            String firstNumber = "1234567890";
            String secondNumber = "1234567890";
            assertEquals(new BigInt(firstNumber).add(new BigInt(secondNumber)).toString(),new BigInteger(firstNumber).add(new BigInteger(secondNumber)).toString());
        }
}
