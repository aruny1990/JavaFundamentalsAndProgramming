package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] ans = twoSum(new int[] {-3,4,3,90}, 0);
		
		for(int an:ans) {
			System.out.println(an);
		}
	}
	    public static int[] twoSum(int[] nums, int target) {
	    	Map<Integer,Integer> runMap = new HashMap<>();
	    	for(int i=0;i<nums.length;i++){
	            int complement = target - nums[i];
	            
	            if(runMap.containsKey(complement)) {
	            	return new int[] {runMap.get(complement),i};
	            }
	            
	            runMap.put(nums[i], i);
	        }
			return new int[] {};
	    }
	
}
