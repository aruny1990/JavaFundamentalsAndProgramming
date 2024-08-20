package JavaConceptsExceptionHandling;

public class ExceptionInInitializationErrorEx {

	//Exception in thread "main" java.lang.ExceptionInInitializerError
	//Caused by: java.lang.ArithmeticException: / by zero
	//static int x = 10/0;
	
	//Caused by: java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
	//at JavaConceptsExceptionHandling.ExceptionInInitializationErrorEx.<clinit>(ExceptionInInitializationErrorEx.java:10)
	static {
		String s = null;
		System.out.println(s.length());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
