package JavaConceptsStreamsExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill", "Jerry");

		Map<Object, Long> nameCounts = names.stream().collect(Collectors.groupingBy(name->name.charAt(0),Collectors.counting()));
		
		System.out.println(nameCounts);
		
	}

}
