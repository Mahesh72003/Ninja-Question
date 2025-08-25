package com.xwork.math;
//Check if a number is a palindrome
public class PalindromeCheck {
    public static void main(String[] args) {
        String checkPalindrome ="14251";
        String rev= new  StringBuilder(checkPalindrome).reverse().toString();

        if (checkPalindrome.equals(rev)){
            System.out.println(checkPalindrome + " is a palindrome.");
        }
        else {
            System.out.println(checkPalindrome + " is not a palindrome.");
        }
    }
}
