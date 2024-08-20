package JavaConceptsArrays;

import JavaConceptsInnerClass.Outer4;

public class ArrrayEx4 {
	
	class InnerException{
		public void nullPointerEx() {
			// ArrayIndexOutOfBoundException
			int[][] x = new int[3][];
			System.out.println(x);
			System.out.println(x[0]);
			System.out.println(x[0][0]);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ArrrayEx4 ex1 = new ArrrayEx4();
		ex1.arrayIndexOutOfBoundEx(); 
		//throw System.exit(0)
		}catch(Exception e) {e.printStackTrace();}
		finally {
		new ArrrayEx4().new InnerException().nullPointerEx();
		}
		}

	public void arrayIndexOutOfBoundEx() {
		// ArrayIndexOutOfBoundException
		int[][] x = new int[3][0];
		System.out.println(x);
		System.out.println(x[0]);
		System.out.println(x[0][0]);

	}

	

}
