package hackerEarth;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String reverse = "";
		for(int i=name.length()-1;i>=0;i--) {
			reverse = reverse+name.toLowerCase().charAt(i);
		}
		
		if(name.equalsIgnoreCase(reverse)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
