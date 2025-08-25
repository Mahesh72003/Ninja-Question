package com.xwork.swap;
// 1.) Java program to swap two numbers without using a third variable

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int numberOne=10;
        int numberTwo=20;
        System.out.println("before swapping 1st No :- "+numberOne+" 2nd No:- "+numberTwo);
        numberOne= numberOne+numberTwo;
        numberTwo=numberOne-numberTwo;
        numberOne=numberOne-numberTwo;

        System.out.println("After swapping 1st No :- "+numberOne+" 2nd No:- "+numberTwo);
    }
}
