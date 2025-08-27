package com.xwork.math;
//Reverse A String In Java
public class ReverseString {
    public static void main(String[] args) {
        String input="Haridra";

        String rev = new StringBuilder(input).reverse().toString();
        System.out.println("the original String is "+input);
        System.out.println("the Reverse String is "+rev);

    }
}
