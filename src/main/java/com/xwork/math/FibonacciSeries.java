package com.xwork.math;
//Print the Fibonacci series up to n terms
public class FibonacciSeries {
    public static void main(String[] args) {
        int input=10;
         int num1=0;
         int num2=1;
        System.out.println("Fibonacci Series up to " + input + " terms: ");
        for (int i=1;i<=input;i++){
            System.out.println(i+":- "+num1+"");
            int nextNum=num1+num2;
            num1=num2;
            num2=nextNum;
        }
    }
}
