package Codewars;

public class DivisorCounter {

	public static void main(String[] args) {
		System.out.println(numberOfDivisors(4)); // Output: 3
		System.out.println(numberOfDivisors(5)); // Output: 2
		System.out.println(numberOfDivisors(12)); // Output: 6
		System.out.println(numberOfDivisors(30)); // Output: 8
	}

	public static long numberOfDivisors(int n) {
		// TODO please write your code below this comment
		if (n <= 0) {
			return 0L;
		}
		long number = (long) n;
		long no = (long) Math.sqrt(n);
		long count = 0L;

		for (long i = 1L; i <= no; i++) {
			if (number % i == 0) {
				if (i * i == n) {
					count++;
				} else {
					count += 2L;
				}
			}
		}

		return count;
	}
}
