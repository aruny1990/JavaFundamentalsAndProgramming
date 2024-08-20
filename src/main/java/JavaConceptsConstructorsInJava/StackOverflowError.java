package JavaConceptsConstructorsInJava;

public class StackOverflowError {
//Exception in thread "main" java.lang.StackOverflowError
	public static void m1() {
		m2();
	}
	
	public static void m2() {
		m1();
	}
	
	public static void main(String[] args) {
		m1();
		System.out.println("Hello");
	}
}
