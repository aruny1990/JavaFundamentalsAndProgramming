package JavaConceptsExceptionHandling;

public class ExceptionHandlingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		doStuff();
	}

	public static void doStuff() {
		// TODO Auto-generated method stub
		doMoreStuff();
		
	}

	public static void doMoreStuff() {
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		System.out.println(10/0);
	}

}
