package JavaConceptsExceptionHandling;

public class ArithematicEx1 {

	//static ArithmeticException e = new ArithmeticException();
	static ArithmeticException e;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//throw e; //Exception in thread "main" java.lang.ArithmeticException
		throw e; //Exception in thread "main" java.lang.NullPointerException: Cannot throw exception because "JavaConceptsExceptionHandling.ArithematicEx1.e" is null
	}

}
