package com.xwork.math;
//Print All Prime Numbers Between 1 and N
public class FindPrimeRange {
    public static void main(String[] args) {
        int n = 100;

        System.out.println("Prime numbers between 1 and " + n + ":");
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            if (i <= 1) {
                isPrime = false;
            }
            else {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.print(i + ", ");
            }
        }
    }
}
