package com.xwork.pattern;
//Symmetrical Number Pyramid
public class SymmetricNumberPyramid {
    public static void main(String[] args) {
        int noOfRow = 100;

        for (int i = 1; i <= noOfRow; i++) {

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
