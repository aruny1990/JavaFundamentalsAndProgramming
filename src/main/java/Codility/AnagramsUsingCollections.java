package Codility;

import java.util.Arrays;

public class AnagramsUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "listen";
        String str2 = "silent";
        
        boolean result = areAnagrams(str1, str2);
        
        boolean result1 = areAnagrams("foefet", "toffee");
        boolean result2 = areAnagrams("Buckethead", "DeathCubeK");
        boolean result3 = areAnagrams("Twoo", "Woot");
        boolean result4 = areAnagrams("apple", "pale");
        System.out.println("Are the two strings anagrams? " + result);

	}

	private static boolean areAnagrams(String str1, String str2) {
		// TODO Auto-generated method stub
		
		char[] ch1 = str1.toLowerCase().toCharArray();
		char[] ch2 = str2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		
		return Arrays.equals(ch1, ch2);
	}

}
