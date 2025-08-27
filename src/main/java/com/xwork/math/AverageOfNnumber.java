package com.xwork.math;
//Calculate Average Of N Numbers
public class AverageOfNnumber {
    public static void main(String[] args) {
        int[] num={11,45,87,99,34,56,234};
        double sum=0;
        double average=0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
            average= sum / num.length;
        }
        System.out.println("Average = " + average);
    }
}
