package hackerEarth;

import java.util.Scanner;

public class ToggleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char[] charArray = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(char ch:charArray) {
			if(Character.isUpperCase(ch)) {
				sb.append(Character.toLowerCase(ch));
			}
			else {
				sb.append(Character.toUpperCase(ch));
				
			}
			
			
		}
		System.out.println(sb.toString());
	}

}
