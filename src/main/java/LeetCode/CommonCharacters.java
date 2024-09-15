package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class CommonCharacters {

	public List<String> commonChars(String[] words) {
        int[] minFreq = new int[26];  // Frequency array for baseline
        // Initialize minFreq with frequencies from the first word
        for (char c : words[0].toCharArray()) {
            minFreq[c - 'a']++;
        }

        // Update minFreq for each subsequent word
        for (int i = 1; i < words.length; i++) {
            int[] freq = new int[26];
            for (char c : words[i].toCharArray()) {
                freq[c - 'a']++;
            }
            // Take the minimum frequency between minFreq and current word's freq
            for (int j = 0; j < 26; j++) {
                minFreq[j] = Math.min(minFreq[j], freq[j]);
            }
        }

        // Collect the characters that appear in all words
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minFreq[i]; j++) {
                result.add(Character.toString((char) (i + 'a')));
            }
        }

        return result;
    }
	
	public static void main(String[] args) {
        CommonCharacters cc = new CommonCharacters();

        // Example 1
        String[] words1 = {"bella", "label", "roller"};
        System.out.println(cc.commonChars(words1));  // Output: ["e", "l", "l"]

        // Example 2
        String[] words2 = {"cool", "lock", "cook"};
        System.out.println(cc.commonChars(words2));  // Output: ["c", "o"]
    }

			
}
