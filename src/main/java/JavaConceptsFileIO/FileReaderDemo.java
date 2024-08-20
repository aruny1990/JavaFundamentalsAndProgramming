package JavaConceptsFileIO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("abc11113131.txt");
		FileReader fr = new FileReader(f);
		System.out.println("Length of the file: " + f.length());
		char[] ch = new char[(int) f.length()];
		int j = fr.read(ch);
		System.out.println("j value is " + j);
		for (char ch1 : ch) {
			System.out.print(ch1);
		}
		fr.close();
		System.out.println("\n************************");
		File f2 = new File("abc11113131.txt");
		System.out.println("f2 length is: " + f2.length());
		FileReader fr1 = new FileReader("abc11113131.txt");
		int i = fr1.read();
		System.out.println("first character in file: " + i);
		while (i != -1) {
			System.out.print((char) i);
			i = fr1.read();
		}

		fr1.close();
	}

}
