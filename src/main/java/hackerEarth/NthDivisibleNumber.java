package hackerEarth;

import java.math.BigInteger;
import java.util.Scanner;

public class NthDivisibleNumber {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    // Input for the values of a, b, and N
    System.out.print("Enter the value of a: ");
    BigInteger a = scanner.nextBigInteger();
    
    System.out.print("Enter the value of b: ");
    BigInteger b = scanner.nextBigInteger();
    
    System.out.print("Enter the value of N: ");
    BigInteger n = scanner.nextBigInteger();

    // Calculate Least Common Multiple (LCM) of a and b
    BigInteger gcd = a.gcd(b);
    BigInteger lcm = a.multiply(b).divide(gcd);

    // Calculate the Nth number divisible by both a and b
    BigInteger nthNumber = lcm.multiply(n);

    // Output the result
    System.out.println("The " + n + "th number divisible by both " + a + " and " + b + " is: " + nthNumber);

    scanner.close();
	}
}
