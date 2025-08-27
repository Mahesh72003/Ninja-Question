package com.xwork.math;
//Find the GCD and LCM of Two Numbers
import java.math.BigInteger;

public class GCDandLCMofNumbers {
    public static void main(String[] args) {
        int num1=20;
        int num2=15;

        int gcd = BigInteger.valueOf(num1).gcd(BigInteger.valueOf(num2)).intValue();

        int lcm = (num1*num2)/gcd;

        System.out.println("the GCD of the two No "+num1+" and "+num2+" value is "+gcd);
        System.out.println("the LCM of the two No "+num1+" and "+num2+" value is "+lcm);
    }
}
