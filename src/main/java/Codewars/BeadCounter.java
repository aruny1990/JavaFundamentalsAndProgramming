package Codewars;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

public class BeadCounter {

	/*
	 * Explanation of the Formula:
Arrangement Description:

Each pair of adjacent blue beads has 2 red beads between them.
If you have N blue beads, you can imagine placing them in a line with red beads in between them.
Number of Gaps:

With N blue beads, there are N - 1 gaps between these blue beads where red beads are placed.
Example: For 5 blue beads: @ @ @ @ @, there are 4 gaps between them.
Red Beads per Gap:

Each of these gaps contains exactly 2 red beads.
Total Number of Red Beads:

Therefore, to find the total number of red beads, you multiply the number of gaps (N - 1) by the number of red beads per gap (2).
	 * */
	
	public static int countRedBeads(final int nBlue) {
		if(nBlue<2) {
			return 0;
		}
		
		
	      return 2*(nBlue-1);
	    }
	
	
	@Test
    public void test0() {
        assertEquals(0, BeadCounter.countRedBeads(0));
    }
    @Test
    public void test1() {
        assertEquals(0, BeadCounter.countRedBeads(1));
    }
    @Test
    public void test3() {
        assertEquals(4, BeadCounter.countRedBeads(3));
    }
    @Test
    public void test5() {
        assertEquals(8, BeadCounter.countRedBeads(5));
    }
	
}
