package hackerEarth;

import java.util.Scanner;

public class TruckTagValidator {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the input tag
        String tag = sc.next();
        
        // Check if the tag is valid
        if (isValidTag(tag)) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
        
        sc.close();
    }
    
    private static boolean isValidTag(String tag) {
        // Check if the character at position 3 is a vowel
        char letter = tag.charAt(2);
        if (isVowel(letter)) {
            return false;
        }

        // Check consecutive digits for even sum
        if (!hasEvenSum(tag.charAt(0), tag.charAt(1)) || 
            !hasEvenSum(tag.charAt(3), tag.charAt(4)) || 
            !hasEvenSum(tag.charAt(4), tag.charAt(5)) || 
            !hasEvenSum(tag.charAt(7), tag.charAt(8))) {
            return false;
        }

        return true;
    }

    private static boolean isVowel(char letter) {
        return "AEIOUY".indexOf(letter) != -1;
    }

    private static boolean hasEvenSum(char digit1, char digit2) {
        int sum = (digit1 - '0') + (digit2 - '0');
        return sum % 2 == 0;
    }
}
