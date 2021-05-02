package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		System.out.println("Welcome to the Measurement Converter");

		boolean running = true;
		while (running) {
			System.out.print("Please enter the length: ");
			Scanner input = new Scanner(System.in);
			String length = input.nextLine();
			int lengthP = Integer.parseInt(length);

			System.out.print("Is the measurement in (m)eters or (f)eet? ");
			String mOrF = input.nextLine();

			if (mOrF.equals("m") || mOrF.equals("M") ) {
				Double feet = lengthP * 3.2808399;
				System.out.format(lengthP + "m is %.0ff.\n", feet);
			}

			if (mOrF.equals("f") || mOrF.equals("F") ) {
				Double meters = lengthP * 0.3048;
				System.out.format(lengthP + "f is %.0fm.\n", meters);
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
