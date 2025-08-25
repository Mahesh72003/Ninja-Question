package com.xwork.math;
//Reverse the digits of an integer (e.g., input:  ? output: 4321).
public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234;
        String rev= new  StringBuilder(String.valueOf(num)).reverse().toString();

        System.out.println("Given number: "+num);
        System.out.println("Reversed number: "+rev);
    }
}
