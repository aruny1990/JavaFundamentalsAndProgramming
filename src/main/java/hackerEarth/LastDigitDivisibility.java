package hackerEarth;

import java.util.Scanner;

public class LastDigitDivisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i=0;i<n;i++) {
			num[i] = sc.nextInt();
		}
		//85 25 65 21 84
		//System.out.println("Printing arrays: ");
		StringBuilder sb = new StringBuilder();
		int rem = 0;
		for(int a:num) {
			//System.out.println("Printing arrays: ");
			//System.out.print(a+" ");
			rem = a%10;
			sb.append(rem);
			rem =0;
		}
		
		//Extracting the last digit
		//System.out.println(sb.toString());
		int remNum = Integer.parseInt(sb.toString());
		
		if(remNum%10==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		sc.close();
	}

}
