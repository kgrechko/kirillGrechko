package com.hillel.hw8;

public class Calculation {
    public static void main(String[] args) {
        ArythmeticCalculator.Calculate (ArythmeticCalculator.firstDouble(), ArythmeticCalculator.secondDouble());

        System.out.println("\n");

        EngineeringCalculator.Calculate(ArythmeticCalculator.firstDouble(), ArythmeticCalculator.secondDouble());

        System.out.println("\n");

        EngineeringCalculator.Calculate();
    }
}
