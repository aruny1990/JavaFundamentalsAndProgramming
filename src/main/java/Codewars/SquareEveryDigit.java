package Codewars;

public class SquareEveryDigit {

	public static int squareDigits(int n) {
		// Convert the number to a string
		String number = Integer.toString(n);
		StringBuilder result = new StringBuilder();

		// Iterate through each character (digit)
		for (char digitChar : number.toCharArray()) {
			// Convert the character to an integer digit
			int digit = Character.getNumericValue(digitChar);

			// Square the digit and append the result to the StringBuilder
			result.append(digit * digit);
		}

		// Convert the concatenated result to an integer and return
		return Integer.parseInt(result.toString());
	}

	public static void main(String[] args) {
		System.out.println(squareDigits(9119)); // Output: 811181
		System.out.println(squareDigits(765)); // Output: 493625
	}
}
