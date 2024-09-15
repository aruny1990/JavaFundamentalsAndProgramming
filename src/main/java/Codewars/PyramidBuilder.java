package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PyramidBuilder {

	public static OptionalInt buildPyramid(int[] stones) {
		
		Arrays.sort(stones);
		Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
		for (int stone : stones) {
			frequencyMap.put(stone, frequencyMap.getOrDefault(stone, 0) + 1);
		}

		
		
        List<Map.Entry<Integer, Integer>> sortedEntries = frequencyMap.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toList());
		
	

		Integer top = null, middle = null, bottom = null;

		for (Map.Entry<Integer, Integer> entry : sortedEntries) {
			int value = entry.getKey();
			int count = entry.getValue();
	
				if (bottom == null && count >= 3) {
					bottom = value;
					count-=3;
				} else if (middle == null && count >= 2) {
					middle = value;
					count -= 2;

				} else if (top == null && count >= 1) {
					top = value;
					count --;
				}
		
			if (top != null && middle != null && bottom != null) {
				return OptionalInt.of(top * 1 + middle * 2 + bottom * 3);
			}

		}

		return OptionalInt.empty();	

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(buildPyramid(new int[] { 5, 3, 5, 3, 0, 0, -1, 0, 0, 3, 3, 3 })); // Output: 14

	}

}
