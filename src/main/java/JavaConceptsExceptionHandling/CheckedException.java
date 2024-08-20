package JavaConceptsExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedException {

	// Exception in thread "main" java.lang.Error: Unresolved compilation problem:
	// Unhandled exception type FileNotFoundException
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter(".\\abc11113131.txt");
		pw.println("Hello");
		System.out.println(10/0);
	}

}
