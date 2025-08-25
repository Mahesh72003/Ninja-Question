package com.xwork.math;
// Check whether a given number is a prime number or not.
public class PrimeCheck {
    public static void main(String[] args) {
        int checkPrime=1;
        boolean isPrime = true;
        if(checkPrime<=1){
            isPrime=false;
        }
        for (int i=2;i<=Math.sqrt(checkPrime);i++){
            if (checkPrime%i==0){
                isPrime=false;
            }
        }
        if (checkPrime==1)
        {
            System.out.println("the given No "+checkPrime+" is neither prime nor composite");
        }
        else if (isPrime){
            System.out.println("the given No "+checkPrime+" is a prime number");
        }
        else {
            System.out.println("the given No "+checkPrime+" is not a prime number");
        }


    }
}
