package Codewars;

import java.util.Arrays;

public class SortingAnArrayByValueAndIndex {

	public static void main(String[] args) {
        int[] input = {23, 2, 3, 4, 5};
        int[] sorted = sortByValueAndIndex(input);
        System.out.println(Arrays.toString(sorted)); // Output: [2, 3, 4, 23, 5]
    }

    public static int[] sortByValueAndIndex(int[] array) {
        // Create an array of indices
        Integer[] indices = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            indices[i] = i;
        }

        // Sort indices based on the product of value and index
        Arrays.sort(indices, (i1, i2) -> {
            int product1 = array[i1] * (i1 + 1); // Convert 0-based index to 1-based
            int product2 = array[i2] * (i2 + 1);
            return Integer.compare(product1, product2);
        });

        // Create the sorted array based on sorted indices
        int[] result = new int[array.length];
        for (int i = 0; i < indices.length; i++) {
            result[i] = array[indices[i]];
        }

        return result;
    }
}
