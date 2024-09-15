package JavaConceptsExceptionHandling;

public class TryCatchBlockHierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {System.out.println(10/0);
		}catch(Exception e) {
			e.printStackTrace();
		}
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			//Unreachable catch block for 
		//ArithmeticException. 
		//It is already handled by the catch block for 
		//Exception

//		catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
	}

}
