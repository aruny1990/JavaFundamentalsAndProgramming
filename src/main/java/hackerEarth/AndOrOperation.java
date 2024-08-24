package hackerEarth;

import java.util.Scanner;

public class AndOrOperation {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of test cases
        int T = scanner.nextInt();
        
        // Process each test case
        for (int t = 0; t < T; t++) {
            // Read inputs a, b, and k
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long k = scanner.nextLong();
            
            long res;
            
            if (k % 2 == 0) {
                // If k is even, the final result is (a & b) | b
                res = (a & b) | b;
            } else {
                // If k is odd, the final result is a & b
                res = a & b;
            }
            
            // Print the final result for this test case
            System.out.println(res);
        }
        
        scanner.close();
    }
}
