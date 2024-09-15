package Codewars;

import java.util.ArrayList;
import java.util.List;

public class PartialWordSearch {

	public static String[] search(String query, String[] strings) {
		List<String> result = new ArrayList<>();
		String lowerCaseQuery = query.toLowerCase();

		for (String str : strings) {
			if (str.toLowerCase().contains(lowerCaseQuery)) {
				result.add(str);
			}
		}

		// If no strings match, return an array with "Empty"
		if (result.isEmpty()) {
			return new String[] { "Empty" };
		}

		return result.toArray(new String[0]);
	}

	public static void main(String[] args) {
		String query = "me";
		String[] strings = { "home", "milk", "Mercury", "fish" };

		String[] result = search(query, strings);
		for (String str : result) {
			System.out.println(str);
		}
	}
}
