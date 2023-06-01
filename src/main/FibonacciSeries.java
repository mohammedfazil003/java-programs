/**
 * Write a simple Java program which will print Fibonacci series up to a given number using iterator.
 */
package main;

import java.util.Scanner;

public class FibonacciSeries {

	private static void fiboSeries(int number) {
		int first = 0, second = 1;

		for (int i = 1; i <= number; i++) {
			System.out.print(first + " ");

			int next = first + second;
			first = second;
			second = next;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of terms..");
		int number = input.nextInt();

		System.out.println("fibonacci series upto " + number + " terms");
		fiboSeries(number);
	}
}