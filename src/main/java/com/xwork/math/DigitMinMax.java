package com.xwork.math;
//Find the largest and smallest digit in a number
public class DigitMinMax {
    public static void main(String[] args) {
        int num = 2005;
        int largest = 0;
        int smallest = 9;
        for (int i = num ; i>0; i=i/10){
            int lastDig = i%10;

            largest=Math.max(lastDig,largest);
            smallest=Math.min(lastDig,smallest);

        }
        System.out.println("the largest digit in Given No "+num+" is "+ largest);
        System.out.println("the smallest digit in Given No "+num+" is "+ smallest);
    }
}
