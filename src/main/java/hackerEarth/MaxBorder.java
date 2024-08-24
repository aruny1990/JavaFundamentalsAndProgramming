package hackerEarth;

import java.util.Scanner;

public class MaxBorder {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();

        while (t-- > 0) {
            // Read the dimensions of the matrix
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            // Create and read the matrix
            char[][] matrix = new char[n][m];
            for (int i = 0; i < n; i++) {
                String row = scanner.next();
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = row.charAt(j);
                }
            }

            // Find the maximum border
            int maxBorder = findMaxBorder(matrix, n, m);
            System.out.println(maxBorder);
        }

        scanner.close();
    }

    private static int findMaxBorder(char[][] matrix, int n, int m) {
        int maxBorder = 0;

        // Check rows for maximum border
        for (int i = 0; i < n; i++) {
            int currentBorder = 0;
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '#') {
                    currentBorder++;
                } else {
                    maxBorder = Math.max(maxBorder, currentBorder);
                    currentBorder = 0;
                }
            }
            maxBorder = Math.max(maxBorder, currentBorder);
        }

        // Check columns for maximum border
        for (int j = 0; j < m; j++) {
            int currentBorder = 0;
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] == '#') {
                    currentBorder++;
                } else {
                    maxBorder = Math.max(maxBorder, currentBorder);
                    currentBorder = 0;
                }
            }
            maxBorder = Math.max(maxBorder, currentBorder);
        }

        return maxBorder;
    }

}
