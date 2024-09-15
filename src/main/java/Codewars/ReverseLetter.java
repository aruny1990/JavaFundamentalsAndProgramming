package Codewars;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.println(reverseLetter(str));
		sc.close();
	}

	private static String reverseLetter(String str) {
		// TODO Auto-generated method stub
		
		str = str.replaceAll("[^a-zA-Z]", "");
		StringBuilder sb = new StringBuilder(str);
		
		//Approach1
//		for(int i=str.length()-1;i>=0;i--) 
//		{
//			sb.append(str.charAt(i));
//		}
		
		
		//Approach2
		sb.reverse();
		return sb.toString();
	}

}
