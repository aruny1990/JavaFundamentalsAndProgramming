package Codility;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] A = {1,3,6,4,5,1,2};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		 int n = A.length;

	        // Step 1: Filter and mark the presence of elements
	        boolean[] present = new boolean[n + 1]; // To store presence of elements from 1 to n

	        for (int i = 0; i < n; i++) {
	            if (A[i] > 0 && A[i] <= n) {
	                present[A[i] - 1] = true; // Mark the element as present
	            }
	        }

	        // Step 2: Find the first missing positive integer
	        for (int i = 0; i < n; i++) {
	            if (!present[i]) {
	                return i + 1; // Return the first missing integer
	            }
	        }

	        // If all numbers from 1 to n are present, the answer is n+1
	        return n + 1;
	}
}
