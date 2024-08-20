package JavaConceptsFileIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc11113131.txt",true);
		fw.write(100);
		fw.write("urga\nSoftwareSolutions");
		fw.write("\n");
		char[] ch1 = {'a','b','c'};
		fw.write(ch1);
		fw.flush();
		fw.close();
	}
}
