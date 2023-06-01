/**
 * Write a program to check the given number is Armstrong.
 * A number is called an Armstrong number if it is equal to the cube of its every digit
 */
package main;

import java.util.Scanner;

public class Armstrong {

	private static boolean isAmstrong(int number) {
		int orginalNum = number;
		int digit, result = 0;
		while (number != 0) {
			digit = number % 10;
			result += Math.pow(digit, 3);
			number = number / 10;
		}
		return orginalNum == result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3 digit number");
		int number = input.nextInt();
		boolean result = isAmstrong(number);

		if (result == true) {
			System.out.println("the given number " + number + " is Armstrong");
		} else {
			System.out.println("the given number " + number + " is not Armstrong");
		}
	}
}
