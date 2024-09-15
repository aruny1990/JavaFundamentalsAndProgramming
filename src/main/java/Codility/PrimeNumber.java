package Codility;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	System.out.println("Prime numbers between 1 and 10 are:");
	for(int i = 1;i<=10;i++)
	{
		if (isPrime(i)) {
			System.out.print(i + " ");
		}
	}
	}


// Method to check if a number is prime
	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
