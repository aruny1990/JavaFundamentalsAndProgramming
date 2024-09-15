package LeetCode;

public class ShuffledString {

	public static String restoreString(String s, int[] indices) {
        // Create a character array to hold the shuffled characters
        char[] shuffled = new char[s.length()];
        
        // Place each character in the correct position
        for (int i = 0; i < s.length(); i++) {
            shuffled[indices[i]] = s.charAt(i);
        }
        
        // Convert the character array back to a string and return it
        return new String(shuffled);
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Example 1
        String s1 = "codeleet";
        int[] indices1 = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString(s1, indices1)); // Output: "leetcode"

	}

}
