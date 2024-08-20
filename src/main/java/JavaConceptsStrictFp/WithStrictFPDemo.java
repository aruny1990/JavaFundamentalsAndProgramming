package JavaConceptsStrictFp;

public strictfp class WithStrictFPDemo {
	public static void main(String[] args) {
		double num1 = 1e40;
		double num2 = 1e-40;
		double result = (num1 + num2) - num1;
		System.out.println("Result without strictfp: " + result);
	}
}
