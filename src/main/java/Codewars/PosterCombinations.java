package Codewars;

public class PosterCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findNumberOfColors(4,2));
	}

	 private static int findNumberOfColors(long m, int n) {
	        for (int x = 0; x <= n; x++) {
	            if (binomialCoefficient(n, x) == m) {
	                return x;
	            }
	        }
	        return -1;
	    }

	    private static long binomialCoefficient(int n, int k) {
	        if (k > n - k) {//n=4 k=2
	            k = n - k;//k=2
	        }
	        long c = 1;
	        for (int i = 0; i < k; i++) {
	            c = c * (n - i) / (i + 1);
	        }//(4-0)/1 * (4-1)/2 
	        return c;
	    }
}
