package Codewars;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class FindingLastElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Test
	public void testList() {
		final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		final int last = FindingLastElementInArray.last(list);
		assertEquals(5, last);
	}

	@Test
	public void testString() {
		final String string = "abcde";
		final char last = FindingLastElementInArray.last(string);
		assertEquals('e', last);
	}

	@Test
	public void testArgs() {
		final int last = FindingLastElementInArray.last(1, 2, 3, 4, 5);
		assertEquals(5, last);
	}

	@Test
	public void testArray() {
		final Integer[] array = { 1, 2, 3, 4, 5 };
		final int last = FindingLastElementInArray.last(array);
		assertEquals(5, last);
	}

	public static <T> T last(final List<T> list) {
		int size = list.size();
		System.out.println(size);
		return list.get(size - 1);
	}

	public static char last(final String string) {
		return string.charAt(string.length() - 1);
	}

	public static <T> T last(final T... list) {
		return list[list.length - 1];
	}

}
