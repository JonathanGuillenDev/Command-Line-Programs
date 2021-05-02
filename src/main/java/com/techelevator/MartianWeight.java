package com.techelevator;

import java.util.Scanner;

public class MartianWeight {

	public static void main(String[] args) {

		System.out.println("Welcome to the Martian Weight Converter");

		boolean running = true;
		while (running) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a series of Earth weights\n(separated by a space, for example 155 175 220): ");
		String earthWeightInputs = input.nextLine();
		String[] earthWeights = earthWeightInputs.split(" ");

		for (int i = 0; i < earthWeights.length; i++) {
			int earthWeight = Integer.parseInt(earthWeights[i]);
			double marsWeight = earthWeight * 0.378;

			System.out.format(earthWeight + " lbs. on Earth is %.0f lbs. on Mars\n", marsWeight);
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
