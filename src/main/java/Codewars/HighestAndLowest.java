package Codewars;

import java.util.Arrays;

public class HighestAndLowest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
	}

	private static String highAndLow(String numbers) {
		// TODO Auto-generated method stub
		String[] parts = numbers.split(" ");
        
        // Convert the array of strings to an array of integers
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }
        
        Arrays.sort(nums);
        // Find the maximum and minimum values
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for (int num : nums) {
//            if (num > max) max = num;
//            if (num < min) min = num;
//        }
        
        // Return the result in the format "max min"
        return nums[nums.length-1] + " " + nums[0];
	}

}
