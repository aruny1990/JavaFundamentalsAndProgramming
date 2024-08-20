package JavaConceptsExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try(BufferedReader br = new BufferedReader(new FileReader("input.txt")))
		{
			//br = new BufferedReader(new FileReader("output.txt"));
		}
	}

}
