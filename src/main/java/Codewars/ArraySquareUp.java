package Codewars;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArraySquareUp {

	public static int[] squareUp(int n) {
	    int[] result = new int[n * n];
	    
	    // Iterate over each block of n elements
	    for (int i = 1; i <= n; i++) {
	        for (int j = 0; j < i; j++) {
	            result[(i * n) - j - 1] = j + 1;
	        }
	    }
	    
	    return result;
	}
	
	 @Test
	    public void Basic_Tests() {
	        System.out.println("Basic Tests");
	        testing(Arrays.toString(ArraySquareUp.squareUp(4)), 
	                Arrays.toString(new int[]
	                {0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1}));
	        testing(Arrays.toString(ArraySquareUp.squareUp(9)), 
	                Arrays.toString(new int[]
	                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 4, 3, 2, 1, 0, 0, 0, 0, 5, 4, 3, 2, 1, 0, 0, 0, 6, 5, 4, 3, 2, 1, 0, 0, 7, 6, 5, 4, 3, 2, 1, 0, 8, 7, 6, 5, 4, 3, 2, 1, 9, 8, 7, 6, 5, 4, 3, 2, 1}));
	        testing(Arrays.toString(ArraySquareUp.squareUp(1)), 
	                Arrays.toString(new int[]
	                {1}));
	    }
	 
	 private static void testing(String act, String exp) {
	        assertEquals(exp, act);
	    }
}

