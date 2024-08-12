package Codewars;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FindNonRepeatingCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your string == ");
		String myString = sc.next();
		String withoutSpecialChar = myString.replaceAll("[^a-zA-z0-9]", "").replaceAll("\\^","");
		System.out.println("Your String is = "+withoutSpecialChar);
		System.out.println(firstNonRepeatingCharacter(withoutSpecialChar));
	}

	private static String firstNonRepeatingCharacter(String string) {
		// TODO Auto-generated method stub
		String lowerCase = string.toLowerCase();
		Map<Character,Integer> myMap = new LinkedHashMap<Character,Integer>();
		
		for(Character ch:lowerCase.toCharArray()) {
			myMap.put(ch, myMap.getOrDefault(ch, 0)+1);
		}
		
		for(int i=0;i<string.length();i++) {
			Character originalChar = string.charAt(i);
			Character newChar = lowerCase.charAt(i);
			if(myMap.get(newChar)==1) {
				return Character.toString(originalChar);
			}
		}
		
		
		return "";
	}

}
