package JavaConceptsFileIO;

import java.io.File;

public class GetttingAllFilesAndDirectories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count =0;
		File f = new File("C:\\");
		String[] s = f.list();
		for(String s1:s) {
			count++;
			System.out.println(s1);
		}
		System.out.println("The total number: "+ count);
	}

}
