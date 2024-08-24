package hackerEarth;

import java.util.Scanner;

public class DivisbleCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);

	        // Read input values
	        int l = scanner.nextInt();
	        int r = scanner.nextInt();
	        int k = scanner.nextInt();

	        // Calculate the first divisible number in the range
	        int firstDivisible = (l % k == 0) ? l : (l + (k - l % k));

	        // Calculate the last divisible number in the range
	        int lastDivisible = (r % k == 0) ? r : (r - r % k);

	        // Check if there's any divisible number in the range
	        if (firstDivisible > r) {
	            System.out.println(0);
	        } else {
	            // Calculate the count of divisible numbers
	            int count = (lastDivisible - firstDivisible) / k + 1;
	            System.out.println(count);
	        }
	}

}
