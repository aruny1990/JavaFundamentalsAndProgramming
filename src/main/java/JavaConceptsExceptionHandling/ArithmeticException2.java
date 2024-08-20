package JavaConceptsExceptionHandling;

public class ArithmeticException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//throw new ArithmeticException("/ by zero");
		//System.out.println("Hello"); //CE: Unreachable code
		
		System.out.println(10/0);
		System.out.println("Hello"); //No CE
	}

}
