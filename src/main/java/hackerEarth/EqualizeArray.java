package hackerEarth;

import java.util.Scanner;

public class EqualizeArray {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input
        int n = scanner.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            B[i] = scanner.nextInt();
        }

        // Find the minimum value in A
        int minA = A[0];
        for (int i = 1; i < n; i++) {
            if (A[i] < minA) {
                minA = A[i];
            }
        }

        int totalSteps = 0;
        
        // Calculate the number of steps
        for (int i = 0; i < n; i++) {
            if (B[i] == 0 && A[i] != minA) {
                // If B[i] is 0 and A[i] is not minA, it's impossible to make them equal
                System.out.println(-1);
                return;
            }
            
            if ((A[i] - minA) % B[i] != 0 && B[i] != 0) {
                // If A[i] can't reach minA exactly by subtracting B[i]
                System.out.println(-1);
                return;
            }
            
            // Add the number of steps required for this element
            totalSteps += (A[i] - minA) / B[i];
        }

        // Print the result
        System.out.println(totalSteps);
    }
}
