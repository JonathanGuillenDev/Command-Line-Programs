package com.techelevator;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println("Welcome to the Fibonacci Series Sequencer");

        boolean running = true;
        while (running) {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter a number to sequence to: ");
            String value = input.nextLine();
            int lastNumber = Integer.parseInt(value);
            int firstFib = 0;
            int secondFib = 1;

            while (firstFib <= lastNumber) {
                int holderValue;
                System.out.print(firstFib + " ");
                holderValue = firstFib;
                firstFib = secondFib;
                secondFib += holderValue;
            }

            System.out.print("\nEnd Program (y/n)? ");
            String response = input.nextLine();
            if (response.equals("y")) {
                running = false;
            }
        }
        System.out.println("Goodbye!");
    }
}