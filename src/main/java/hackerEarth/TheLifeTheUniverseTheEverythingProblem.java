package hackerEarth;

import java.util.Scanner;

public class TheLifeTheUniverseTheEverythingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int num = sc.nextInt();
			if(num!=42) {
			System.out.println(num);
			}else {
				break;
			}
		}
		
		sc.close();

	}

}
