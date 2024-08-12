package Codewars;

import java.util.Scanner;

public class MaxRotationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number you want ot rotate");
		long number = sc.nextLong();
		System.out.println(maxRotate(number));
		
		
	}

	private static long maxRotate(long number) {
		// TODO Auto-generated method stub
		long max = number;
		String num = Long.toString(number);
		for(int i=0;i<num.length()-1;i++) {
			num = num.substring(0,i)+rotateLeft(num.substring(i));
			Long myNum = Long.parseLong(num);
			if(myNum>max) {
				max = myNum;
			}
		}
		
		return max;
	}

	private static String rotateLeft(String string) {
		// TODO Auto-generated method stub
		if(string.length()<=1) {
			return "";
		}
		return string.substring(1)+string.charAt(0);
	}

}//56789  //67895 //68957
