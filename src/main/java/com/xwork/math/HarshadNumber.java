package com.xwork.math;
//Check whether a number is a Harshad number (divisible by the sum of its digits).
public class HarshadNumber {
    public static void main(String[] args) {
        int input=153;
        int sum=0;

        for (int i=input; i>0; i=i/10){
            sum = sum + i %10;
        }
        if (input % sum == 0) {
            System.out.println(input + " is a Harshad number.");
        }
        else {
            System.out.println(input + " is not a Harshad number.");
        }
    }
}
