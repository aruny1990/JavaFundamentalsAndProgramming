package JavaConceptsExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;

public class MultiCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File f = new File(".//abc.txt");
			System.out.println(10/0);
			String s = null;
			System.out.println(s.length());
		}catch(ArithmeticException| NullPointerException e) {
			e.printStackTrace();
		}
	}

}
