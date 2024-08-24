package hackerEarth;

import java.util.Scanner;

public class ProductOfElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Constants
        final int MOD = 1000000007;

        // Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Reading the size of the array
        int n = scanner.nextInt();

        // Initialize the product variable
        long product = 1;

        // Reading the array elements and calculating the product modulo MOD
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            product = (product * num) % MOD;
        }

        // Printing the result
        System.out.println(product);

	}
	
	

}
