package Codewars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PyramidBuilders {


    public static Integer buildPyramid(int[] stones) {
        // Step 1: Count frequencies of each stone
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int stone : stones) {
            frequencyMap.put(stone, frequencyMap.getOrDefault(stone, 0) + 1);
        }

        // Convert frequency map to a list of entries and sort by value (frequency) in descending order
        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(frequencyMap.entrySet());
        sortedEntries.sort((a, b) -> b.getValue() - a.getValue());

        // Step 2: Try to form the pyramid
        Integer top = null, middle = null, bottom = null;

        // Try to find valid top, middle, bottom layers
        for (Map.Entry<Integer, Integer> entry : sortedEntries) {
            int value = entry.getKey();
            int count = entry.getValue();
            if (top == null && count >= 1) {
                top = value;
                count--;
            } else if (middle == null && count >= 2) {
                middle = value;
                count -= 2;
            } else if (bottom == null && count >= 3) {
                bottom = value;
                count -= 3;
            }

            // If all layers are found
            if (top != null && middle != null && bottom != null) {
                return top * 1 + middle * 2 + bottom * 3;
            }
        }

        // If we cannot form a valid pyramid
        return null;
    }
    
    public static void main(String[] args) {
        // Test cases
        System.out.println(buildPyramid(new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3})); // Output: 14
        System.out.println(buildPyramid(new int[]{-1, -1, 0, 0, 1, 1})); // Output: null
        System.out.println(buildPyramid(new int[]{})); // Output: null
    }
}
