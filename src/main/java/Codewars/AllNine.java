package Codewars;

import java.math.BigInteger;

public class AllNine {

	public static BigInteger findSmallestM(int x) {
        // If x is even, return -1 because no multiple of an even number can consist only of 9's.
        if (x % 2 == 0) {
            return BigInteger.valueOf(-1);
        }

        // Starting with a number containing all 9's
        BigInteger allNines = BigInteger.valueOf(9);
        BigInteger multiplier = BigInteger.ONE;
        BigInteger bigX = BigInteger.valueOf(x);

        // Keep multiplying by 10 and adding 9 (to form numbers like 9, 99, 999, ...)
        while (true) {
            // Check if the current 'allNines' is divisible by x
            if (allNines.mod(bigX).equals(BigInteger.ZERO)) {
                return allNines.divide(bigX);  // Return m
            }

            // Update allNines to the next number with all nines (e.g., 9 -> 99 -> 999)
            allNines = allNines.multiply(BigInteger.TEN).add(BigInteger.valueOf(9));
        }
    }

    public static void main(String[] args) {
        System.out.println(findSmallestM(11)); // 9
        System.out.println(findSmallestM(12)); // -1
        System.out.println(findSmallestM(13)); // 76923
    }
}
