package com.xwork.math;
//Check if a number is a strong number
public class StrongNumber {
    public static void main(String[] args) {
        int input = 123;
        int orig = input;
        int sum=0;

        while (input>0){
            int digit = input % 10;
            int fact=1;
            for (int i=1;i<=digit;i++){
                fact = fact*i;
            }
            sum=sum+fact;

            input = input/10;
        }
        if (sum == orig) {
            System.out.println(orig + " is a Strong Number.");
        }
        else
        {
            System.out.println(orig + " is not a Strong Number.");
        }

    }
}
