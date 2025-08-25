package com.xwork.math;
// Check whether a number is an Armstrong number
public class ArmstrongCheck {
    public static void main(String[] args) {
        int num1 =9474;
        int num2= num1;
        int lengthNum=String.valueOf(num1).length();
        int sum=0;

        for (int i = 0; i < lengthNum; i++) {
            int digit = num1 % 10;
            sum += Math.pow(digit, lengthNum);
            num1 /= 10;
        }

        if (sum==num2){
            System.out.println(num2 + " is an Armstrong number.");
        }
        else {
            System.out.println(num2 + " is not an Armstrong number.");
        }

    }
}
