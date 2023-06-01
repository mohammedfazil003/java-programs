/**
 * Write a simple Java program to check if a given String is palindrome or not.
 * E.g: "pop" is a palindrome while "pen" is not a palindrome.
 */
package main;

import java.util.Scanner;

public class PalindromeString {

	private static boolean checkPalindrome(String str) {
		int length = str.length() - 1;
		for (int i = 0; i < (length) / 2; i++) {
			if (str.charAt(i) != str.charAt(length)) {
				return false;
			}
			length--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string ..");
		String str = input.nextLine();

		boolean result = checkPalindrome(str);
		if (result == true) {
			System.out.println("the given string is a palindrome");
		} else {
			System.out.println("the given string is not a palindrome");
		}
	}
}
