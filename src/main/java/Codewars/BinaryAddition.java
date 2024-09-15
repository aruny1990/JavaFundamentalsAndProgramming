package Codewars;

import java.util.Scanner;

public class BinaryAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(binarySum(a,b));
			sc.close();
	}

	private static String binarySum(int a, int b) {
		// TODO Auto-generated method stub
		int sum = a + b;
		return Integer.toBinaryString(sum);
	}

}
