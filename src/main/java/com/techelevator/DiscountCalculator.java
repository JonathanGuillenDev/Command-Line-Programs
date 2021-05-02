package com.techelevator;


import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args) {

        System.out.println("Welcome to the Discount Calculator");

        boolean running = true;
        while (running) {

            System.out.print("Please enter a list of prices, separated by spaces \n(for example: 12.22 14 53.35) : ");
            Scanner input = new Scanner(System.in);
            String prices = input.nextLine();
            String[] priceArray = prices.split(" ");

            System.out.print("Please enter a discount percentage \n(for example: 20 for a 20% discount): ");
            String discount = input.nextLine();

            double total = 0;
            for (int i = 0; i < priceArray.length; i++) {
                double undiscountedPrice = Double.parseDouble(priceArray[i]);
                total += undiscountedPrice;
            }

            int discountPercent = Integer.parseInt(discount);
            double discountAmount = total * (discountPercent / 100.0);
            double discountedTotal = total - discountAmount;
            System.out.format("The total price is: $%.2f.\nThe discounted total is: $%.2f.\n", total, discountedTotal);

            System.out.print("End Program (y/n)? ");
            String response = input.nextLine();
            if (response.equals("y")) {
                running = false;
            }
        }
        System.out.println("Goodbye!");
    }
}
