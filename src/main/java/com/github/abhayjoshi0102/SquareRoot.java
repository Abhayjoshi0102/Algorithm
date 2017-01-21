package com.github.abhayjoshi0102;

/**
 * Problem Statement:
 * Given an integer x , Your task is to find the  square root of it. If x is not a perfect square, then return floor(√x)
 * 1 ≤ N ≤ 1000000
 */
public class SquareRoot {
    /**
     * This method gets the floor of square root. This method accept int as input.
     * @param number for which you want to calculate the square root
     * @return the square root of the number.
     */
    public static int getSquareRootFirstMethod(int number) {
        int squareRoot = 0;
        for(int i = 1 ; i <= number ; i ++) {
            if(i*i <= number) {
                squareRoot ++;
                continue;
            }
            else {
                break;
            }
        }
        return squareRoot;
    }

    /**
     * This method gets the floor of square root. This method accept long as input.
     * @param number for which you want to calculate the square root
     * @return the square root of the number.
     */
    public static long getSquareRootFirstMethod(long number) {
        long squareRoot = 0;
        for(int i = 1 ; i <= number ; i ++) {
            if(i*i <= number) {
                squareRoot ++;
                continue;
            }
            else {
                break;
            }
        }
        return squareRoot;
    }

    /**
     * This method gets the floor of square root. This method accept int as input.
     * @param number for which you want to calculate the square root
     * @return the square root of the number.
     */
    public static int getSquareRootSecondMethod(int number) {
        int i = 1;
        while (i*i <= number) {
            i++;
        }
        return --i;
    }

    /**
     * This method gets the floor of square root. This method accept long as input.
     * @param number for which you want to calculate the square root
     * @return the square root of the number.
     */
    public static long getSquareRootSecondMethod(long number) {
        long i = 1;
        while (i*i <= number) {
            i++;
        }
        return --i;
    }
}
