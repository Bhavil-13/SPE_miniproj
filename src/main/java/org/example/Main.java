package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== Scientific Calculator =====");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power Function (x^b)");
            System.out.println("5. Exit");
            System.out.print("Choose an operation: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    logger.info("Square Root Function selected.");
                    squareRoot(scanner);
                    break;
                case 2:
                    logger.info("Factorial Function selected.");
                    factorial(scanner);
                    break;
                case 3:
                    logger.info("Natural Logarithm Function selected.");
                    naturalLog(scanner);
                    break;
                case 4:
                    logger.info("Power Function selected.");
                    powerFunction(scanner);
                    break;
                case 5:
                    logger.info("Exiting the calculator.");
                    System.out.println("Exiting...");
                    break;
                default:
                    logger.warn("Invalid choice: " + choice);
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        scanner.close();
    }

//    Hello Bhavil

    // Square root function
    private static void squareRoot(Scanner scanner) {
        System.out.print("Enter a number: ");
        double x = scanner.nextDouble();
        if (x < 0) {
            logger.error("Square root of negative number attempted.");
            System.out.println("Error: Cannot compute square root of a negative number.");
        } else {
            double result = Math.sqrt(x);
            logger.info("Square root of " + x + " is " + result);
            System.out.println("Result: √" + x + " = " + result);
        }
    }

    // Factorial function
    private static void factorial(Scanner scanner) {
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        if (x < 0) {
            logger.error("Factorial of negative number attempted.");
            System.out.println("Error: Factorial is not defined for negative numbers.");
        } else {
            long result = 1;
            for (int i = 2; i <= x; i++) {
                result *= i;
            }
            logger.info("Factorial of " + x + " is " + result);
            System.out.println("Result: " + x + "! = " + result);
        }
    }

    // Natural logarithm function
    private static void naturalLog(Scanner scanner) {
        System.out.print("Enter a number: ");
        double x = scanner.nextDouble();
        if (x <= 0) {
            logger.error("Natural logarithm of non-positive number attempted.");
            System.out.println("Error: Natural logarithm is not defined for zero or negative numbers.");
        } else {
            double result = Math.log(x);
            logger.info("Natural logarithm of " + x + " is " + result);
            System.out.println("Result: ln(" + x + ") = " + result);
        }
    }

    // Power function
    private static void powerFunction(Scanner scanner) {
        System.out.print("Enter the base (x): ");
        double x = scanner.nextDouble();
        System.out.print("Enter the exponent (b): ");
        double b = scanner.nextDouble();
        double result = Math.pow(x, b);
        logger.info("Power function: " + x + "^" + b + " = " + result);
        System.out.println("Result: " + x + "^" + b + " = " + result);
    }
}