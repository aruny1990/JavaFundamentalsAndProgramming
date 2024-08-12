package JavaConceptsLiterals;

public class FloatingPoointLiteral {

	public static void main(String[] args) {
		//float f = 123.456; //invalid //Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//Type mismatch: cannot convert from double to float
		float f1 = 123.456f; //valid
		double d = 123.456; //valid
		double d1 = 123.456D;//valid
		//float f2 = 123.456d;//invalid
		double d2 = 123.456; //valid
		double d3 = 0123.456; //valid
		//double d4 = 0x123.456; //invalid CE: Malformed floating point literal
		//double d5 = 0786; //Invalid //Point is not there so it is treated as octal
		double d6 = 0xFace; //valid
		System.out.println(d6);
		double d7 = 0786.0; //valid - answer 786.0
		//double d8 = 0XFace.0;//invalid CE: Malformed number
		double d9 = 10; //valid
		double df = 0777; //valid
		double dp = 1.2e3;//valid 
		System.out.println(dp);
		int p = (int) 10.0;
		System.out.println(p);
	}
}
