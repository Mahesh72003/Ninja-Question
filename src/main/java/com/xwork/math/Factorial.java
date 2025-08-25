package com.xwork.math;
// Find the factorial using loops and recursion
public class Factorial {
    // Recursive method
    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorialRecursive(n - 1);
    }
    // Loop method
    public static long factorialLoop(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        int num=21;

        System.out.println("Factorial for "+num+" by using loop: " + factorialLoop(num));
        System.out.println("Factorial for "+num+" by using recursion: " + factorialRecursive(num));

    }
}
