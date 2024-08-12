package JavaConceptsJavadatatypes;

import java.math.BigInteger;

public class JavaDatatypes {

	public static void main(String[] args) {
		byte b1 = 10; //- valid 
		byte b2 = 127; //- valid
		//byte b3 = 128; //– compile time error //Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//Type mismatch: cannot convert from int to byte
		
		byte b4 = -128;
		//byte b5  = 10.5; //invalid //Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//Type mismatch: cannot convert from double to byte
		//byte b6 = true; //invalid //Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//Type mismatch: cannot convert from boolean to byte
		//byte b7 = "durga"; // invalid //Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//Type mismatch: cannot convert from String to byte
	
	
	//short
		short s1 = 32767;
		short s2 = -32768;
		//short s3 = 32768; //invalid //Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//Type mismatch: cannot convert from int to short
		//short s4 = true;//invalids
		
		//int
		int x = 2147483647;
		int y = -2147483648;
		//int z = 2147483648; //invalid  //Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//The literal 2147483648 of type int is out of range 
//		String str1 = "2147483648";
//		long a = Long.parseLong(str1);
//		System.out.println("Number is: "+a);
//		long z = 2147483648L;
//		Double d = 2147483648d;
//		System.out.println("Long number is "+z);
//		System.out.println("Double number is "+d);
		long g = 2147483648L;
		System.out.println(g);
		//int k = 2147483648l; //invalid //Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//Type mismatch: cannot convert from long to int

		//Boolean
		boolean b = true;//valid
	//	boolean b1 = 0; //invalid //Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
		//Duplicate local variable b1
		//Type mismatch: cannot convert from int to boolean


		
		//boolean b4 = True; //invalid   //Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
		//Duplicate local variable b4
		//True cannot be resolved to a variable
		
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//Type mismatch: cannot convert from int to boolean
		int i =0;
//		if(i) {
//			System.out.println("Hello");
//		}else {
//			System.out.println("Hi");
//		}
		
	}
}
