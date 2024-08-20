package JavaConceptsExceptionHandling;

public class ThrowExceptionEx2 extends RuntimeException {

	public static void main(String[] args) throws ThrowExceptionEx2 {
		throw new ThrowExceptionEx2();
	}
}
