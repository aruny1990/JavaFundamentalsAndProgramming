package Codewars;



import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class FindMinAndMax {

	@Test
	public void sampleTests() {
		assertArrayEquals(new int[] { 1, 1 }, FindMinAndMax.getMinMax(Arrays.asList(1)));
		assertArrayEquals(new int[] { 1, 2 }, FindMinAndMax.getMinMax(Arrays.asList(1, 2)));
		assertArrayEquals(new int[] { 1, 2 }, FindMinAndMax.getMinMax(Arrays.asList(2, 1)));
	}

	public static int[] getMinMax(List<Integer> list) {
		// your code here...
		Collections.sort(list);

		return new int[] { list.get(0), list.get(list.size() - 1) };
	}

}
