package JavaConceptsExceptionHandling;

public class ExceptionHandlingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		doStuff();
		System.out.println(10/0);
	}

	public static void doStuff() {
		// TODO Auto-generated method stub
		doMoreStuff();
		System.out.println("Hi");
	}

	public static void doMoreStuff() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
	}

}
