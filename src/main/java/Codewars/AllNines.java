package Codewars;

import java.math.BigInteger;

public class AllNines {

	 public static BigInteger findSmallestM(BigInteger x) {
	        if (x.mod(BigInteger.TWO).equals(BigInteger.ZERO) || x.mod(BigInteger.valueOf(5)).equals(BigInteger.ZERO)) {
	            return BigInteger.valueOf(-1);  // Return -1 as a BigInteger if no solution exists.
	        }

	        BigInteger allNines = BigInteger.ZERO;
	        BigInteger bigX = x;
	        BigInteger currentMultiple;
	        //int m = 1;

	        // Keep adding nines and checking the multiples
	        while (true) {
	            allNines = allNines.multiply(BigInteger.TEN).add(BigInteger.valueOf(9));
	            currentMultiple = allNines.divide(bigX);
	            if (allNines.mod(bigX).equals(BigInteger.ZERO)) {
	                return currentMultiple;
	            }
	            //m++;
	        }
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findSmallestM(BigInteger.valueOf(11))); // 9
        System.out.println(findSmallestM(BigInteger.valueOf(12))); // -1
        System.out.println(findSmallestM(BigInteger.valueOf(13))); // 76923
	}

}
