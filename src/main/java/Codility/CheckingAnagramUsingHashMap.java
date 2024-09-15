package Codility;

import java.util.HashMap;
import java.util.Map;

public class CheckingAnagramUsingHashMap {

	public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        
        boolean result = areAnagrams(str1, str2);
        System.out.println("Are the two strings anagrams? " + result);
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Check if lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create a frequency map for the first string
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the frequency of each character in the first string
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Subtract the frequency of each character in the second string
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (!charCountMap.containsKey(c)) {
                return false; // If the character is not in the map, they are not anagrams
            }
            charCountMap.put(c, charCountMap.get(c) - 1);
        }

        // Check if all counts are 0
        for (int count : charCountMap.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
