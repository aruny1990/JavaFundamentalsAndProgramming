package JavaConceptsFileIO;

import java.io.File;
import java.io.IOException;

public class FileDirectory {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("durga123");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
		File f1 = new File(f,"demo.txt");
		f1.createNewFile();
		
	}

}
