package Codewars;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DescendingOrderDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the non negative integer you want to reverse");
		int number = sc.nextInt();
		System.out.println(reverseDigit(number));
	}

	public static int reverseDigit(int number) {
		// TODO Auto-generated method stub
		if(number<0) {
			return -1;
		}
		String no = Integer.toString(number);
		
		Character[] digits = new Character[no.length()];
		
		for(int i=0;i<no.length();i++) {
			digits[i] = no.charAt(i);
		}
		
		Arrays.sort(digits,Collections.reverseOrder());
		
		StringBuilder sb = new StringBuilder();
		
		for(Character digit: digits) {
			sb.append(digit);
		}
		return Integer.parseInt(sb.toString());
		
	}
}
