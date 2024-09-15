package Codility;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner sc = new Scanner(System.in);
	        System.out.println("Please enter the string");
	        String str = sc.next();
	        System.out.println(countString(str));
	        //Input - AAABBCCDDD
	        //output - A3B2C2D3
	    
	}

	private static String countString(String str) {
		// TODO Auto-generated method stub
		System.out.println("String is "+str);
		Map<Character,Integer> myMap = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
				myMap.put(str.charAt(i), myMap.getOrDefault(str.charAt(i), 0)+1);	
		}
		
		StringBuffer sb = new StringBuffer();
		System.out.println(myMap);
		for(java.util.Map.Entry<Character, Integer> map1:myMap.entrySet()) {
			System.out.println(map1.getKey()+" "+map1.getValue());
			sb.append(map1.getKey());
			sb.append(map1.getValue());
		}
		return sb.toString();
	}

}
