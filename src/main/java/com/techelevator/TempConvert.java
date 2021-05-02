package com.techelevator;

import java.util.Locale;
import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		System.out.println("Welcome to the Temperature Converter");

		boolean running = true;
		while (running) {
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter the temperature: ");
			String temperatureInput = input.nextLine();
			Integer temperature = Integer.parseInt(temperatureInput);

			System.out.print("Is the temperature in (C)elsius or (F)ahrenheit? ");
			String celsiusOrFarenheit = input.nextLine();

			if (celsiusOrFarenheit.equals("C") || celsiusOrFarenheit.equals("c")) {
				Double temperatureFarenheit = (temperature * 1.8) + 32;
				System.out.format(temperature + "C is %.0fF.\n", temperatureFarenheit);
			}

			if (celsiusOrFarenheit.equals("F") || celsiusOrFarenheit.equals("f")) {
				Double temperatureCelsius = (temperature - 32) / 1.8;
				System.out.format(temperature + "F is %.0fC.\n", temperatureCelsius);
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
