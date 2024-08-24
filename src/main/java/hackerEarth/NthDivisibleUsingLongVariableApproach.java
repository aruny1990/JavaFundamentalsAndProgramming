package hackerEarth;

import java.util.Scanner;

public class NthDivisibleUsingLongVariableApproach {
	// Function to calculate GCD using Euclidean algorithm
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM using GCD
    public static long lcm(long a, long b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of test cases
        int T = scanner.nextInt();

        // Process each test case
        for (int t = 0; t < T; t++) {
            // Read inputs a, b, and N
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long N = scanner.nextLong();

            // Calculate LCM of a and b
            long lcm = lcm(a, b);

            // Calculate the N-th multiple of the LCM
            long nthNumber = N * lcm;

            // Print the result
            System.out.println(nthNumber);
        }

        scanner.close();
    }
}
