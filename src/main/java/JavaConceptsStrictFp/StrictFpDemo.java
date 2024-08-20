package JavaConceptsStrictFp;

public class StrictFpDemo {
	public static void main(String[] args) {
		double num1 = 1e300;
		double num2 = 1e-300;
		double result = (num1 + num2) - num1;
		System.out.println("Result without strictfp: " + result);
	}
}
