package Codewars;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Please enter the string = ");
		 String myString = sc.next();
		 System.out.println(firstNonRepeatingLetter(myString));
	       // System.out.println(firstNonRepeatingLetter("a")); // should return 't'
	       // System.out.println(firstNonRepeatingLetter("sTreSS")); // should return 'T'
	       // System.out.println(firstNonRepeatingLetter("aabbcc")); // should return ''
	    }

	 public static String firstNonRepeatingLetter(String str) {
	        if (str == null || str.isEmpty()) {
	            return "";
	        }

	        // Use a LinkedHashMap to maintain the order of characters
	        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

	        // Convert the string to lowercase for case-insensitive comparison
	        String lowerStr = str.toLowerCase();

	        // Count occurrences of each character
	        for (char ch : lowerStr.toCharArray()) {
	            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
	        }

	        // Find the first non-repeating character in the original string
	        for (int i = 0; i < str.length(); i++) {
	            char originalChar = str.charAt(i);
	            char lowerChar = lowerStr.charAt(i);
	            if (charCountMap.get(lowerChar) == 1) {
	                return Character.toString(originalChar);
	            }
	        }

	        // Return an empty string if there are no non-repeating characters
	        return "";
	    }
	 
}
