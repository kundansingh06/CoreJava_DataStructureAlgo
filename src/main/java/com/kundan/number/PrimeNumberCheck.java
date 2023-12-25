package com.kundan.number;

public class PrimeNumberCheck {
    public static void main(String[] args) {

        int START = 1;
        int end = 10;
        System.out.println("List of prime numbers between " + START + " and " + end);

        /*for (int i = START; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }*/

        boolean isprime = isPrime(10);
        if (isprime){
            System.out.println("number is prime");

        }
        else {
            System.out.println("number is not  prime");

        }



    }

    public static boolean isPrime(int num) {
        for(int i = 2; i <= num/i; ++i) {
            if(num % i == 0) {
                return false;
               }
          }
        return true;
    }

}

