package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.jar.Attributes.Name;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class CountingTheFirstLetterOccurences {

	public static void main(String[] args) {
		String[] input = { "Raushan", "Band", "Ravi", "Raushan", "Kane", "Raj", "Raj" };
		//ArrayList<String> myList = new ArrayList<String>();
		HashMap<String, Integer> countMap = new HashMap<String, Integer>();
		for (String inp : input) {
			if (inp.charAt(0) == 'R') {
				countMap.put(inp, countMap.getOrDefault(inp, 0) + 1);
			}
		}

		// Output the count map
		System.out.println("Occurrences of names starting with each letter:");
		for (Entry<String, Integer> entry : countMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		// Using streams API
//String[] input = {"Raushan", "Band", "Ravi", "Raushan", "Kane", "Raj", "Raj"};

		System.out.println("Using Streams API== ");
		// Using Stream API to filter, group and count the occurrences
		Map<String, Long> occurrences = Arrays.stream(input).filter(str -> str.startsWith("R"))
				.collect(Collectors.groupingBy(str -> str, Collectors.counting()));

		// Print the occurrences
		occurrences.forEach((key, value) -> System.out.println(key + ": " + value));
	}
}
