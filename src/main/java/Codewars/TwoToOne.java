package Codewars;

import java.util.Set;
import java.util.TreeSet;

public class TwoToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "xyaabbbccccdefww";
		String s2 = "xxxxyyyyabklmopq";
		System.out.println(longest(s1,s2));
	}

	private static String longest(String s1, String s2) {
		// TODO Auto-generated method stub
		String s3 = s1+s2;
		
		Set<Character> mySet = new TreeSet<Character>();
		for(char c:s3.toCharArray()) {
			mySet.add(c);
		}
		System.out.println(mySet);
		StringBuilder sb = new StringBuilder();
		
		for(char c1:mySet) {
			sb.append(c1);
		}
		return sb.toString();
	}

}
