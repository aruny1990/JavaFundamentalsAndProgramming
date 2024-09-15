package Codewars;

import java.util.Arrays;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class HighestProfitWins {

	public static int[] minMax(int[] arr) {
		Arrays.sort(arr);
		
		if(arr.length==1) {
			return new int[] {arr[0],arr[0]};
		}else {
			return new int[] {arr[0],arr[arr.length-1]};
		}

        // Your awesome code here
    }
	
Random rand;
    
    @Before
    public void initTest() {
        rand = new Random();
    }
    
    @Test
    public void testExampleCases() {
      assertArrayEquals(new int[]{1,5}, HighestProfitWins.minMax(new int[]{1,2,3,4,5}));
      assertArrayEquals(new int[]{5, 2334454}, HighestProfitWins.minMax(new int[]{2334454,5}));
      assertArrayEquals(new int[]{1, 1}, HighestProfitWins.minMax(new int[]{1}));
    }

    @Test
    public void minMaxRandomTest() {
        for(int i = 0; i < 20; i++) {
            int r = rand.nextInt();
            assertArrayEquals(new int[]{r, r}, HighestProfitWins.minMax(new int[]{r}));
        }
    }   
}
