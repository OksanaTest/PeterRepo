package com;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<String, Double> context = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter A param");
        double paramA = scanner.nextDouble();
        System.out.println("enter B param");
        double paramB = scanner.nextDouble();
        System.out.println("enter C param");
        double paramC = scanner.nextDouble();

        double desc = Math.pow(paramB, 2) - 4*paramA*paramC;
        System.out.println("Descriminat is " + desc);

        if (desc < 0) {
            System.out.println("Descriminat is negative, no solution for the ");
        }else if(desc == 0){
            double x = -paramB/(2*paramA);
            System.out.println("Only one root is " + x);
        } else{
            double x = (-paramB + Math.sqrt(desc)) / (2.0 * paramA);
            double r2 = (-paramB - Math.sqrt(desc)) / (2.0 * paramA);
            System.out.println("The roots are " + x + " and " + r2);
        }
    }
}
