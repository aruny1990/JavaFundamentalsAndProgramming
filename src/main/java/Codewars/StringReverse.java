package Codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringReverse {
	

public static void main(String[] args) {
	long a = 87;
	System.out.println("The number of steps requried to make the number palindrome is = "+findSteps(a));
}

private static int findSteps(long a) {
	// TODO Auto-generated method stub
	int steps = 0;
	
	while(true) {
		//System.out.println(reverse(a));
		if(!isPalind(a)) {
		a = a + reverse(a);
		steps++;
		}else {
			break;
		}
	}
	
	return steps;
}

private static boolean isPalind(long a) {
	// TODO Auto-generated method stub
	long rev = reverse(a);
	return a==rev;
}

private static long reverse(long a) {
	// TODO Auto-generated method stub
	long rev = 0;
	while(a>0) {
		long rem = a % 10;
		rev = rev*10+rem;
		a = a/10;
	}
	return rev;
}
}
