package Codewars;

import java.util.Scanner;

public class CamelCaseSplitter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your string== ");
		String myString = sc.next();
		System.out.println(splitCamelCase(myString));
		sc.close();
		// TODO Auto-generated method stub
		//System.out.println(splitCamelCase("camelCasing")); // Output: "camel Casing"
        //System.out.println(splitCamelCase("identifier"));  // Output: "identifier"
      //  System.out.println(splitCamelCase(""));  
	}

	public static String splitCamelCase(String string) {
		// TODO Auto-generated method stub
		StringBuilder result = new StringBuilder();
		for(Character ch: string.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				result.append(" ");
			}
			result.append(ch);
		}
		return result.toString();
	}

}
