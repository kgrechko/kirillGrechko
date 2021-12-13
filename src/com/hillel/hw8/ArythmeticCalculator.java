package com.hillel.hw8;
import java.util.Scanner;

public class ArythmeticCalculator {
    public static double firstDouble()
    {
        System.out.println("Enter the first number");
        Scanner scanner = new Scanner(System.in);
        double i = scanner.nextDouble();
        System.out.println(i);
        return i;
    }

    public static double secondDouble()
    {
        System.out.println("Enter the second number");
        Scanner scanner = new Scanner(System.in);
        double i = scanner.nextDouble();
        System.out.println(i);
        return i;
    }

    public static void Calculate (double a, double b)
    {
        double result;
        System.out.println("Select one of the operations: +, -, /, *");
        Scanner scanner = new Scanner(System.in);
        String i = scanner.nextLine();
        System.out.println(i + " Operation");
        switch (i)
        {
            case ("+"):
                result = a+b;
                System.out.println("Result is " + result);
                break;

            case ("-"):
                result = a-b;
                System.out.println("Result is " + result);
                break;

            case("/"):
                result = a/b;
                System.out.println("Result is " + result);
                break;

            case ("*"):
                result = a*b;
                System.out.println("Result is " + result);
                break;

        }


        
    }
}
