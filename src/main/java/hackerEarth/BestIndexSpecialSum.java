package hackerEarth;

import java.util.Scanner;

public class BestIndexSpecialSum {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of elements
        int n = sc.nextInt();
        
        // Read the array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Variable to store the maximum special sum
        long maxSpecialSum = Long.MIN_VALUE;
        
        // Calculate the special sum for each possible index
        for (int i = 0; i < n; i++) {
            long specialSum = 0;
            int elementsToPick = 1;
            int startIndex = i;
            
            // Sum elements in blocks of increasing size
            while (startIndex + elementsToPick <= n) {
                for (int j = 0; j < elementsToPick; j++) {
                    specialSum += arr[startIndex + j];
                }
                startIndex += elementsToPick;
                elementsToPick++;
            }
            
            // Update the maximum special sum
            maxSpecialSum = Math.max(maxSpecialSum, specialSum);
        }
        
        // Print the maximum special sum
        System.out.println(maxSpecialSum);
        
        sc.close();
    }
}
