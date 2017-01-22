package com.github.abhayjoshi0102;

public class TestStuff {
    public static void main(String [] args) {
        String number1 = "111111111111111111111111111";
        String number2 = "1111111111111111111111111111111111111";
        String result = "";
        String pad="";
        int carry = 0;
        if(number2.length() >number1.length()) {
            String temp = number1;
            number1 = number2;
            number2 = temp;
        }
        for (int i = 0 ; i < (number1.length() - number2.length()) ; i++ ) {
             pad = pad + "0";
        }
        number2 = number2.concat(pad);
        for(int i = number1.length()-1; i >= 0; i--) {
            int num1 = Integer.parseInt(Character.toString(number1.charAt(i)));
            int num2 = Integer.parseInt(Character.toString(number2.charAt(i)));
            int sum = carry + num1 + num2;
            int lastDigit = sum%10;
            result = result.concat(String.valueOf(lastDigit));
            carry = sum/10;
        }
        if(carry == 1)
        result = result.concat(String.valueOf(carry));
        System.out.println(reverse(result));

    }

    private static String reverse(String str) {
        String reverse = "";
        int length = str.length();
        for( int i = length - 1 ; i >= 0 ; i-- ) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
}
