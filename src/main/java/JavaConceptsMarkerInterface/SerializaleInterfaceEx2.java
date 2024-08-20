package JavaConceptsMarkerInterface;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class AB implements Serializable {
	int i;
	String s;

	// A class constructor
	public AB(int i, String s) {
		this.i = i;
		this.s = s;
	}
}

public class SerializaleInterfaceEx2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		 AB a = new AB(20,"GeeksForGeeks"); 
		  
	        // Serializing 'a' 
	        FileOutputStream fos = new FileOutputStream("xyz.txt"); 
	        ObjectOutputStream oos = new ObjectOutputStream(fos); 
	        oos.writeObject(a); 
	  
	        // De-serializing 'a' 
	        FileInputStream fis = new FileInputStream("xyz.txt"); 
	        ObjectInputStream ois = new ObjectInputStream(fis); 
	        AB b = (AB)ois.readObject();//down-casting object 
	  
	        System.out.println(b.i+" "+b.s); 
	  
	        // closing streams 
	        oos.close(); 
	        ois.close();
	}
}
