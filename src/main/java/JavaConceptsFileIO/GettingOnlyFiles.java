package JavaConceptsFileIO;

import java.io.File;

public class GettingOnlyFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		File f = new File("C:\\");
		String[] s = f.list();
		for(String s1:s) {
			File f1 = new File(f,s1);
			if(f1.isFile()) {
			count++;
			System.out.println(s1);
			}
		}
		System.out.println("The total number: "+ count);

	}

}
