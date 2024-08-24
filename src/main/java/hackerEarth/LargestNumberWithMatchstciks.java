package hackerEarth;

import java.util.Scanner;

public class LargestNumberWithMatchstciks {
 
		// Array to store the number of matchsticks required to display digits 0-9
	    private static final int[] matchsticks = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        // Number of test cases
	        int T = sc.nextInt();

	        // Process each test case
	        while (T-- > 0) {
	            String N = sc.next();
	            int totalMatchsticks = 0;

	            // Calculate the total number of matchsticks required to display the number N
	            for (char digit : N.toCharArray()) {
	                totalMatchsticks += matchsticks[digit - '0'];
	            }

	            // Generate the largest number using the available matchsticks
	            StringBuilder result = new StringBuilder();
	            if (totalMatchsticks % 2 == 1) {
	                // If the total number of matchsticks is odd, start with '7'
	                result.append('7');
	                totalMatchsticks -= 3;
	            }
	            // Fill the rest with '1'
	            while (totalMatchsticks > 0) {
	                result.append('1');
	                totalMatchsticks -= 2;
	            }

	            // Print the result for this test case
	            System.out.println(result.toString());
	        }

	        sc.close();

	}
}
