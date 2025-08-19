package com.example.bmicalculator;


import java.util.Scanner;

public class BmiCalculator {

    public double calculateBMI(double weightKg, double heightMeters) {
        if (heightMeters <= 0 || weightKg <= 0) {
            throw new IllegalArgumentException("Height and weight must be positive");
        }
        return weightKg / (heightMeters * heightMeters);
    }

    public String categorizeBMI(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiCalculator calculator = new BmiCalculator();

        try {
            System.out.print("Enter weight (kg): ");
            double weight = scanner.nextDouble();

            System.out.print("Enter height (meters): ");
            double height = scanner.nextDouble();

            double bmi = calculator.calculateBMI(weight, height);
            System.out.printf("Your BMI is: %.2f%n", bmi);
            System.out.println("BMI Category: " + calculator.categorizeBMI(bmi));
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values for weight and height.");
        } finally {
            scanner.close();
        }
    }
}
