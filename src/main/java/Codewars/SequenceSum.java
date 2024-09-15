package Codewars;

public class SequenceSum {

	public static int sequenceSum(int begin, int end, int step) {
		// Check if begin is greater than end
		if (begin > end) {
			return 0;
		}

		// Initialize the sum
		int sum = 0;

		// Iterate from begin to end, adding each value to the sum
		for (int i = begin; i <= end; i += step) {
			sum += i;
		}

		// Return the computed sum
		return sum;
	}

	public static void main(String[] args) {
		// Test cases
		System.out.println(sequenceSum(2, 2, 2)); // Output: 2
		System.out.println(sequenceSum(2, 6, 2)); // Output: 12 (2 + 4 + 6)
		System.out.println(sequenceSum(1, 5, 1)); // Output: 15 (1 + 2 + 3 + 4 + 5)
		System.out.println(sequenceSum(1, 5, 3)); // Output: 5 (1 + 4)
	}
}
