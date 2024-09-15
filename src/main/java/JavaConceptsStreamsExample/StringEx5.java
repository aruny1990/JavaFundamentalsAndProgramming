package JavaConceptsStreamsExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill");

        // Collect names into a map where the key is the name and the value is the length of the name
        Map<String, Integer> nameLengthMap = names.stream()
                                                  .collect(Collectors.toMap(name -> name, String::length));

        System.out.println(nameLengthMap);
	}

}
