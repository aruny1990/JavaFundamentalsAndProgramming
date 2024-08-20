package JavaConceptsExceptionHandling;

import Codewars.ArithematicProgression;

public class TryCatchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.toString()); // gives java.lang.ArithmeticException: / by zero
			System.out.println(e.getMessage()); // just print / by 0
		}
	}

}
;