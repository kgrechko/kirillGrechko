package com.hillel.hw8;

import java.util.Scanner;
import java.lang.Math;

public class EngineeringCalculator extends ArythmeticCalculator {

    public static void Calculate (double a, double b) {
        double result;
        System.out.println("Select one of the operations for 2 numbers: +, -, /, *; % ");
        Scanner scanner = new Scanner(System.in);
        String i = scanner.nextLine();
        System.out.println(i + " Operation");
        switch (i) {
            case ("+"):
                result = a + b;
                System.out.println("Result is " + result);
                break;

            case ("-"):
                result = a - b;
                System.out.println("Result is " + result);
                break;

            case ("/"):
                result = a / b;
                System.out.println("Result is " + result);
                break;

            case ("*"):
                result = a * b;
                System.out.println("Result is " + result);
                break;

            case ("%"):
                result = a % b;
                System.out.println("Result is " + result);
                break;

        }
    }


    public static void Calculate(){
        double result;

        System.out.println("Enter angle from 0 to 360 ");
        Scanner scanner = new Scanner(System.in);
        double i = scanner.nextDouble();
        System.out.println(i);
        double iRad = Math.toRadians(i);

        System.out.println("Select one of the operations: sin, cos, tan ");
        Scanner scan = new Scanner(System.in);
        String operation = scan.nextLine();
        System.out.println(i + " Operation");

        switch (operation) {
            case ("sin"):

                result =  Math.sin(iRad);
                System.out.println("Result is " + result);
                break;

            case ("cos"):
                result =  Math.cos(iRad);
                System.out.println("Result is " + result);
                break;

            case ("tan"):
                result =  Math.tan(iRad);
                System.out.println("Result is " + result);
                break;

        }
    }
}
