package JavaConceptsStreamsExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx4 {



	public static void main(String[] args) {
		List<List<String>> listOfLists = Arrays.asList(
	            Arrays.asList("John", "Jane"),
	            Arrays.asList("Jack", "Jill"),
	            Arrays.asList("Jerry")
	        );

	        // Flatten the nested lists into a single list
	        List<String> allNames = listOfLists.stream()
	                                           .flatMap(List::stream)
	                                           .collect(Collectors.toList());

	        System.out.println(allNames); // Output: [John, Jane, Jack, Jill, Jerry]

	}
}
