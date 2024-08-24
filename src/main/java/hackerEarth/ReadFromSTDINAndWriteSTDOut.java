package hackerEarth;

import java.util.Scanner;

public class ReadFromSTDINAndWriteSTDOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//Reading the input
		System.out.println("Enter the first line");
		int firstLine = sc.nextInt();
		
		System.out.println("Enter the input string");
		String inpString = sc.next();
		
		System.out.println(firstLine*2);
		System.out.println(inpString);
		sc.close();
	}

}
