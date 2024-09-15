package Codewars;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class BetweenExtreemes {

	
	
	
	@Test
    public void fixedTest() {
        assertEquals(42, BetweenExtreemes.betweenExtremes(new int[]{21, 34, 54, 43, 26, 12}));
        assertEquals(99, BetweenExtreemes.betweenExtremes(new int[]{-1, -41, -77, -100}));
    }

	private static int betweenExtremes(int[] numbers) {
		// TODO Auto-generated method stub
		Arrays.sort(numbers);
		System.out.println(numbers[0]+"..........."+numbers[numbers.length-1]);
		int minMaxDiff = numbers[numbers.length-1] - numbers[0];
		return minMaxDiff;
	}
}
