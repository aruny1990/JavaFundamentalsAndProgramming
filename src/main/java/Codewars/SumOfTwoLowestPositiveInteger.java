package Codewars;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SumOfTwoLowestPositiveInteger {

	
    @Test
    public void basicTests() {
      assertEquals(13L, SumOfTwoLowestPositiveInteger.sumTwoSmallestNumbers(new long []{5, 8, 12, 19, 22}));
      assertEquals(6L, SumOfTwoLowestPositiveInteger.sumTwoSmallestNumbers(new long []{15, 28, 4, 2, 43}));
      assertEquals(6L, SumOfTwoLowestPositiveInteger.sumTwoSmallestNumbers(new long []{3, 87, 3, 12, 7}));
      assertEquals(24L, SumOfTwoLowestPositiveInteger.sumTwoSmallestNumbers(new long []{23, 71, 33, 82, 1}));
      assertEquals(16L, SumOfTwoLowestPositiveInteger.sumTwoSmallestNumbers(new long []{52, 76, 14, 12, 4}));
    }

	private static long sumTwoSmallestNumbers(final long[] numbers) {
		// TODO Auto-generated method stub
		Arrays.sort(numbers);
		long sum = numbers[0]+numbers[1];
		return sum;
	}
}
