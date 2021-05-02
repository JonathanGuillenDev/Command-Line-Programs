package com.techelevator;


import java.util.Scanner;

public class KilometerConverter {

    public static void main(String[] args) {

        System.out.println("Welcome to the Kilometer Converter");

        boolean running = true;
        while (running) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a kilometer value to start at (numbers only): ");
        String value = input.nextLine();
        int kilometerStart = Integer.parseInt(value);

        System.out.print("Enter a kilometer value to end with (numbers only): ");
        value = input.nextLine();
        int kilometerEnd = Integer.parseInt(value);

        System.out.print("How many should it increment by (numbers only): ");
        value = input.nextLine();
        int incrementBy = Integer.parseInt(value);

        System.out.println("\nGoing from " + kilometerStart + "km to " + kilometerEnd +
                "km in increments of " + incrementBy + "km.\n");

        for (int i = kilometerStart; i <= kilometerEnd; i += incrementBy) {
            double miles = kilometersToMiles(i);
            System.out.println(i + "km is " + String.format("%.2f ", miles) + "mi.");
        }

            System.out.print("End Program (y/n)? ");
            String response = input.nextLine();
            if (response.equals("y")) {
                running = false;
            }
            System.out.println("Goodbye!");
        }
    }

    static public double kilometersToMiles(int kilometers) {
        double miles = kilometers * 0.621371;
        return miles;
    }
}
