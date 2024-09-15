package Codility;

public class LongestPalindrome {

	public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        
        int start = 0, end = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);   // Odd length palindrome
            int len2 = expandAroundCenter(s, i, i + 1); // Even length palindrome
            int len = Math.max(len1, len2);
            
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        
        return s.substring(start, end + 1);
    }
    
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
    
    public static void main(String[] args) {
    	LongestPalindrome lps = new LongestPalindrome();
        
        // Example 1
        String s1 = "babad";
        System.out.println("Longest Palindromic Substring of 'babad': " + lps.longestPalindrome(s1)); // Output: "bab" or "aba"
        
        // Example 2
        String s2 = "cbbd";
        System.out.println("Longest Palindromic Substring of 'cbbd': " + lps.longestPalindrome(s2)); // Output: "bb"
        
        // Example 3
        String s3 = "a";
        System.out.println("Longest Palindromic Substring of 'a': " + lps.longestPalindrome(s3)); // Output: "a"
        
        // Example 4
        String s4 = "ac";
        System.out.println("Longest Palindromic Substring of 'ac': " + lps.longestPalindrome(s4)); // Output: "a" or "c"
    }
}
