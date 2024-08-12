package Codewars;

import java.util.ArrayList;
import java.util.List;

public class RangeExtraction {
	public static void main(String[] args) {
		// Test case
		int[] numbers = { -10, -9,-8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20 };
		System.out.println(rangeExtraction(numbers)); // Output: "-10--8,-6,-3-1,3-5,7-11,14,15,17-20"
	} //-10--8,-6,-3-1,3-5,7-11,14,15,17-20

	public static String rangeExtraction(int[] numbers) {
		// TODO Auto-generated method stub
		List<String> result = new ArrayList<>();
		// Iterate through the sorted numbers
		int start = numbers[0];
		int end = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			// Check if the current number continues the range
			if (numbers[i] == end + 1) {
				end = numbers[i]; //-8
			} else {
				// End of the current range or single number
				addRangeOrNumber(result, start, end);
				start = numbers[i];
				end = numbers[i];
			}
		}

		// Add the last range or number
		addRangeOrNumber(result, start, end);

		// Join all parts with commas and return
		return String.join(",", result);

	}

	private static void addRangeOrNumber(List<String> result, int start, int end) {
		// TODO Auto-generated method stub
		if (end - start >= 2) {
			// Add range format
			result.add(start + "-" + end);
		} else if (end > start) {
			// Add two consecutive numbers
			result.add(start + "," + end);
		} else {
			// Add single number
			result.add(String.valueOf(start));
		}
	}
}
