package hackerEarth;
/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.math.BigInteger;

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;

class Practice {
	public static void main(String args[]) throws Exception {
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
            BigInteger a1 = BigInteger.valueOf(a);
            BigInteger b1 = BigInteger.valueOf(b);
            BigInteger N1 = BigInteger.valueOf(N);
            
            BigInteger p = a1.multiply(b1).divide(a1.gcd(b1));
            System.out.println("Nth divisor is "+p.multiply(N1));
            
	}
}


		
	}