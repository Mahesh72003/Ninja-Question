package com.xwork.math;
//Find the Sum of Even and Odd Digits in a Number
public class EvenOddDigitSum {
    public static void main(String[] args) {
        int num = 7534621;
        int evenSum = 0;
        int oddSum = 0;
        System.out.println("the give no is "+num);
        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                evenSum = evenSum+digit;
            }
            else {
                oddSum = oddSum+digit;
            }
            num = num/10;
        }
        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);
    }
}
