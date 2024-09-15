package JavaConceptsStreamsExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsEx1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = Arrays.asList("John","Jane","Jack","Jill","Jerry");
		
	List<String> filtereNames = names.stream().filter(name -> name.startsWith("J"))
		.collect(Collectors.toList());
		
	System.out.println(filtereNames);
	}

}
