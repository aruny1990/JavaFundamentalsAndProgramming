package hackerEarth;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

        // Read the input number N
        int N = scanner.nextInt();

        // Initialize the factorial as a BigInteger
        BigInteger factorial = BigInteger.ONE;

        // Calculate the factorial
        for (int i = 1; i <= N; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        // Print the factorial
        System.out.println(factorial);
	}

}
