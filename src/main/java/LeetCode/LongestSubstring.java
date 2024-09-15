package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String myStr = sc.next();
		System.out.println(longestSubstring(myStr));
	}

	private static int longestSubstring(String myStr) {
		// TODO Auto-generated method stub
		int n = myStr.length();
		int maxLength = 0;
		int left = 0;
		
		if(n==0) {
			return 0;
		}
		
		Map<Character,Integer> myMap = new HashMap<>();
		
		for(int right=0;right<n;right++) {
			char currentChar = myStr.charAt(right);
			if(myMap.containsKey(currentChar) && myMap.get(currentChar)>=left) {
				//Move the left pointer to the right of the previous occurence
				left = myMap.get(currentChar)+1;
			}
			
			//update the myMap index of the current character
			myMap.put(currentChar, right);
			
			//update the maximum length
			maxLength = Math.max(maxLength, right-left+1);
		}
		return maxLength;
	}

}
