package com.gradedproject.q2;

import java.util.Scanner;

public class PowerCalculation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the base number X: ");
		int x = scanner.nextInt();

		System.out.print("Enter the power N: ");
		int n = scanner.nextInt();

		long result = calculatePower(x, n);

		System.out.println("X power N is: " + result);

		scanner.close();
	}

	public static long calculatePower(int x, int n) {
		if (n == 0) {
			return 1;
		} else if (n % 2 == 0) {
			long temp = calculatePower(x, n / 2);
			return temp * temp;
		} else {
			long temp = calculatePower(x, n / 2);
			return temp * temp * x;
		}
	}
}
