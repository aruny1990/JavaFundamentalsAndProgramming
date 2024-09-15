package JavaConceptsStreamsExample;

import java.util.Arrays;
import java.util.List;

public class StreamEx2 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		Integer sumOfSquares = numbers.stream().map(n -> n*n).reduce(0,Integer::sum);
		
		System.out.println(sumOfSquares);
	}
}
