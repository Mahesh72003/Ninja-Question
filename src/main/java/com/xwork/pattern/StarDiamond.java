package com.xwork.pattern;
//Diamond Star Pattern
public class StarDiamond {
    public static void main(String[] args) {
        int noOfStar=5;

        for (int i = 1; i <= noOfStar; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = noOfStar-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
