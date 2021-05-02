package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		System.out.println("Welcome to the Decimal Number to Binary Number Converter");

		boolean running = true;
		while (running) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a series of numbers separated by spaces\n(for example 33 56 342 985) : ");
		String[] decimals = input.nextLine().split(" ");

		for (int i = 0; i < decimals.length; i++) {
			int decimal = Integer.parseInt(decimals[i]);
			String binary = Integer.toBinaryString(decimal);
			System.out.println(decimal + " in binary is " + binary);
		}
			System.out.print("End Program (y/n)? ");
			String response = input.nextLine();
			if (response.equals("y")) {
				running = false;
			}
		}
		System.out.println("Goodbye!");
	}
}