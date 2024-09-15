package Practice;

import java.util.ArrayList;
import java.util.List;

public class GenerateCombinations {

	private static void generateCombinations(String s, int index, StringBuilder current, List<String> possibilities) {
		if (index == s.length()) {
			possibilities.add(current.toString());
			return;
		}

		char c = s.charAt(index);
		if (c > 'a') {
			current.append((char) (c - 1));
			generateCombinations(s, index + 1, current, possibilities);
			current.setLength(current.length() - 1);
		}

		if (c < 'z') {
			current.append((char) (c + 1));
			generateCombinations(s, index + 1, current, possibilities);
			current.setLength(current.length() - 1);
		}
	}

	public static void main(String[] args) {
		List<String> possibilities = new ArrayList<>();
		generateCombinations("adfa", 0, new StringBuilder(), possibilities); // Expected output: true
	}
}
