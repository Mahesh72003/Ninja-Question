package com.xwork.math;
//Perfect Number In Java
public class PerfectNumber {
    public static void main(String[] args) {
        int input = 24;
        int sum =0;

        for (int i = 1; i < input; i++) {
            if (input % i == 0) {
                sum += i;
            }
        }

        if (sum == input) {
            System.out.println(input + " is a Perfect Number.");
        } else {
            System.out.println(input + " is not a Perfect Number.");
        }

    }
}
