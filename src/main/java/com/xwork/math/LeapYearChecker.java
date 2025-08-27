package com.xwork.math;
//Check Leap Year Or Not
public class LeapYearChecker {
    public static void main(String[] args) {
        int year=2024;

        boolean isLeapYear=false;

        if (year%4==0){
            isLeapYear=true;
            if (year % 100 == 0) {
                if (year%400==0){
                    isLeapYear=true;
                }
                else {
                    isLeapYear=false;
                }
            }
        }

        if (isLeapYear){
            System.out.println("the given Year "+year + " is Leap-year");
        }
        else
        {
            System.out.println("the given Year "+year + " is Not Leap-year");
        }
    }
}
