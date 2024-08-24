package hackerEarth;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the given string
        String s = scanner.nextLine();

        // Sort the given string to create a reference anagram string
        String sortedS = sortString(s);

        // Read the size of the directory
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Initialize a counter for anagrams
        int anagramCount = 0;

        // Iterate over each name in the directory
        for (int i = 0; i < n; i++) {
            // Read the name from the directory
            String name = scanner.nextLine();

            // Sort the name and compare with sortedS
            if (sortString(name).equals(sortedS)) {
                anagramCount++;
            }
            
        }

        // Print the count of anagrams found
        System.out.println(anagramCount);

        // Close the scanner
        scanner.close();
    }

    // Helper method to sort the characters of a string
    public static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    
	}

}
