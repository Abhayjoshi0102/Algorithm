package com.github.abhayjoshi0102;

import java.util.BitSet;

public class TestStuff {
    public static void main(String [] args) {
        /*
        BitSet bitSet = new BitSet();
        System.out.println(bitSet.size());
        bitSet.set(65);
        System.out.println(bitSet.size());
        for(int i = 0; i < bitSet.size(); i++) {
            System.out.println(bitSet.get(i));
        }
        */
        final long WORD_MASK = 0xffffffffffffffffL;
        System.out.println(WORD_MASK);
        System.out.println(1L << 8);
    }
}
