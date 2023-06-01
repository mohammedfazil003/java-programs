/**
 * Write a Java program to check if a given number is prime or not. 
 */
package main;

import java.util.Scanner;

public class PrimeNumbers {

	private static boolean checkPrime(int number) {
		if (number <= 1) {
			return false;
		}
		System.out.println(Math.sqrt(number));
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = input.nextInt();

		boolean result = checkPrime(number);
		if (result == true) {
			System.out.println("the given number " + number + " is prime.");
		} else {
			System.out.println("the given number " + number + " is not a prime.");
		}
	}
}
