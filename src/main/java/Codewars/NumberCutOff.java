package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberCutOff {

	public static String[] cutOffNumber(int number) {
		// Convert the number to a string
		String numStr = Integer.toString(number);
		// Create a list to store the resulting strings
		String[] result = new String[numStr.length()];
		// Loop through each character in the string
		for (int i = 0; i < numStr.length(); i++) {
			// Create a substring from the start to the current index + 1
			result[i]  = numStr.substring(0,i+1);
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cutOffNumber(420)); // ["4", "42", "420"]
		System.out.println(cutOffNumber(2017)); // ["2", "20", "201", "2017"]
		System.out.println(cutOffNumber(2010)); // ["2", "20", "201", "2010"]
		System.out.println(cutOffNumber(4020)); // ["4", "40", "402", "4020"]
		System.out.println(cutOffNumber(80200)); // ["8", "80", "802", "8020", "80200"]
	}

}
