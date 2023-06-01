/**
 * Write a simple Java program which will print Fibonacci series up to a given number using recursion.
 */
package main;

import java.util.Scanner;

public class FibonacciSeriesRecursion {

	private static int fibboSeries(int number) {
		if (number == 0) {
			return 0;
		} else if (number == 1) {
			return 1;
		} else {
			return fibboSeries(number - 1) + fibboSeries(number - 2);
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of terms..");
		int number = input.nextInt();
		System.out.println("fibonacci series upto " + number + " terms");

		for (int i = 0; i < number; i++) {
			System.out.print(fibboSeries(i) + " ");
		}
	}
}
