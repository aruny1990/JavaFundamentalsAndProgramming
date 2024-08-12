package ProgramsAndelaProgram;

import java.util.Scanner;

public class ReverseDigitToGetPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int steps = countSteps(n);
		System.out.println("number of steps is: "+steps);
		sc.close();
	}

	private static int countSteps(long n) {
		// TODO Auto-generated method stub
		int steps =0;
		while (!isPalind(n)) {
			n = n + reversedNumber(n);
			steps++;
		}
		return steps;
	}

	public static boolean isPalind(long n) {
		return n == reversedNumber(n);
	}

	public static long reversedNumber(long n) {
		long rev = 0;
		while (n > 0) {
			long rem = n%10;
			rev = rev*10+rem;
			n =n /10;
		}
		return rev;

	}

}
