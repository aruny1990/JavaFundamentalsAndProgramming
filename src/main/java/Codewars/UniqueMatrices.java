package Codewars;

import java.util.HashSet;
import java.util.Set;

public class UniqueMatrices {
	public static void main(String[] args) {
//        int[][] matrices = {
//            {1, 2, 3, 4},
//            {3, 1, 4, 2},
//            {4, 3, 2, 1},
//            {2, 4, 1, 3}
//        };
		
		  int[][] matrices = new int[][] {{1, 2, 2, 1},
              {1, 1, 2, 2},
              {2, 1, 1, 2},
              {2, 1, 2, 1},
              {1, 2, 1, 2}};

        System.out.println(countDifferentMatrices(matrices));  // Output should be 1
    }

    public static int countDifferentMatrices(int[][] matrices) {
        Set<String> uniqueMatrices = new HashSet<>();

        for (int[] matrix : matrices) {
            String canonicalForm = getCanonicalForm(matrix);
            uniqueMatrices.add(canonicalForm);
        }

        return uniqueMatrices.size();
    }

    private static String getCanonicalForm(int[] matrix) {
        String[] rotations = new String[4];

        rotations[0] = matrixToString(matrix);
        rotations[1] = matrixToString(rotate90(matrix));
        rotations[2] = matrixToString(rotate180(matrix));
        rotations[3] = matrixToString(rotate270(matrix));

        return getMinString(rotations);
    }

    private static String matrixToString(int[] matrix) {
        return matrix[0] + "," + matrix[1] + "," + matrix[2] + "," + matrix[3];
    }

    private static int[] rotate90(int[] matrix) {
        return new int[]{matrix[2], matrix[0], matrix[3], matrix[1]};
    }

    private static int[] rotate180(int[] matrix) {
        return new int[]{matrix[3], matrix[2], matrix[1], matrix[0]};
    }

    private static int[] rotate270(int[] matrix) {
        return new int[]{matrix[1], matrix[3], matrix[0], matrix[2]};
    }

    private static String getMinString(String[] strings) {
        String min = strings[0];
        for (String s : strings) {
            if (s.compareTo(min) < 0) {
                min = s;
            }
        }
        return min;
    }
}
