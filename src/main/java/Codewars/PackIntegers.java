package Codewars;

import java.util.Arrays;
import java.util.Collections;

public class PackIntegers {

	public static long packArray(int[] arr) {
		// Implement me! :)
		long result = 0L;
		for (int i = 0; i < arr.length; i++) {
			result |= ((long) arr[i] << (8 * i));
		}
		return result;
		
		
	}

	public static void main(String[] args) {
		int[] a = { 24, 85, 0 };
		System.out.println(packArray(a)); // Output should be 21784
		
	}
}
