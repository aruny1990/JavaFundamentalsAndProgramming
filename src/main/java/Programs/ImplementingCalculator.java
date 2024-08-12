package Programs;

import java.util.Scanner;

public class ImplementingCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter second number: ");
		double num2 = sc.nextDouble();
		
		System.out.println("Enter third number: ");
		double num3 = sc.nextDouble();
		
		System.out.println("Enter operator (+-*/): ");
		char oper = sc.next().charAt(0);
		
		double result;
		
		switch(oper) {
		
		case '+':
			result = num1+num2;
			break;
		
		case '-':
			result = num1-num2;
			break;
			
		case '*':
			result = num1*num2;
			break;
			
		case '/':
			if(num2!=0) {
				result = num1/num2;
			}else {
				System.out.println("Error Division by 0");
				return;
			}
			break;
		default:
			System.out.println("Default operator");
			return;
		}
		
		System.out.println("The result is: "+result);
	}

}
