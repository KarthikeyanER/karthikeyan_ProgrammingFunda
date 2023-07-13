package com.gradedproject.q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base number X: ");
		int X = sc.nextInt();
		System.out.println("Enter the power N = ");
		int N = sc.nextInt();

		PowerOfANumber powerOfANumber = new PowerOfANumber();
		int result = powerOfANumber.nPowerOfX(X, N);
		System.out.printf("%d power %d is: %d", X, N, result);
		sc.close();
	}

}
