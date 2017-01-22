package com.github.abhayjoshi0102.miscellaneous;


public class BigInt {
    private String number;
    public BigInt(String number) {
        this.number = number;
    }

    // Right now this method is working just for positive number addition.
    public BigInt add(BigInt numberToBeAdded) {
        String firstNumber = this.number;
        String secondNumber = numberToBeAdded.number;
        String result = "";
        String output = "";
        if(secondNumber.length() > firstNumber.length()) {
            String temp = firstNumber;
            secondNumber = firstNumber;
            firstNumber = temp;
        }
        String leftPad = "";
        for (int i = secondNumber.length() ; i < firstNumber.length(); i++) {
            leftPad = leftPad + "0";
        }
        int carry = 0;
        for(int i = firstNumber.length() - 1 ; i >= 0 ; i--) {
            int sum = carry +Integer.parseInt(Character.toString(firstNumber.charAt(i))) + Integer.parseInt(Character.toString(firstNumber.charAt(i)));
            carry = sum/10;
            int resultDigit = sum%10;
            result += resultDigit;
        }
        if(carry != 0) {
            result += carry;
        }
        for(int i = result.length()-1 ; i >= 0 ; i--) {
            output += result.charAt(i);
        }
        return new BigInt(output);
    }

    @Override
    public String toString() {
        return this.number;
    }

}
