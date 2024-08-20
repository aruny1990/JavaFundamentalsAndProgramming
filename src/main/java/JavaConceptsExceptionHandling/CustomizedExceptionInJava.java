package JavaConceptsExceptionHandling;

import java.util.Scanner;

class TooYoungException extends RuntimeException {
	TooYoungException(String s) {
		super(s);
	}
}
	class TooOldException extends RuntimeException {
		TooOldException(String s) {
			super(s);
		}
	}

public class CustomizedExceptionInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age>60) {
			throw new TooOldException("Your age is too much");
		}
		else if(age<18) {
			throw new TooYoungException("You are too young");
		}else {
			System.out.println("You will find match soon");
		}
		
	}

}
