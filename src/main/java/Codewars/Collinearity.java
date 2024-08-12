package Codewars;

import java.util.Scanner;

public class Collinearity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y1= sc.nextInt();
		int y2 = sc.nextInt();
		System.out.println(collinearity(x1, y1, x2, y2));
		System.out.println(collinearity(5, 7, 0, 0));
	}
	
	  public static boolean collinearity(int x1, int y1, int x2, int y2) {
		    return x1*y2-x2*y1==0;
		  }

}
