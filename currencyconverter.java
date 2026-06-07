package JAVA;

import java.util.Scanner;

public class currencyconverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double amount, convertedAmount;
        int choice;

        // Currency conversion rates
        final double USD_TO_INR = 83.20;
        final double INR_TO_USD = 0.012;
        final double EUR_TO_INR = 90.50;
        final double INR_TO_EUR = 0.011;

        System.out.println("===== Currency Converter =====");
        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
        System.out.println("3. EUR to INR");
        System.out.println("4. INR to EUR");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        System.out.print("Enter amount: ");
        amount = sc.nextDouble();

        switch (choice) {

            case 1:
                convertedAmount = amount * USD_TO_INR;
                System.out.println(amount + " USD = " + convertedAmount + " INR");
                break;

            case 2:
                convertedAmount = amount * INR_TO_USD;
                System.out.println(amount + " INR = " + convertedAmount + " USD");
                break;

            case 3:
                convertedAmount = amount * EUR_TO_INR;
                System.out.println(amount + " EUR = " + convertedAmount + " INR");
                break;

            case 4:
                convertedAmount = amount * INR_TO_EUR;
                System.out.println(amount + " INR = " + convertedAmount + " EUR");
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}