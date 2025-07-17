package com;

import java.util.Scanner;

public class PrimeNumberChecker {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number to check: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " - просте число");
        } else {
            System.out.println(number + " - складене число");
        }
    }
}