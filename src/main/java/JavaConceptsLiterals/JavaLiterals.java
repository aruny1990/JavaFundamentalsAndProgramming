package JavaConceptsLiterals;

public class JavaLiterals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y = 010;
		int z = 0x10;
		System.out.println("x is "+x);
		System.out.println("y is "+y);
		System.out.println("z is "+z);
		
		
		int i =10; ///valid
		//int j = 0786; //invalid  //Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//The literal 0786 of type int is out of range //Because it is octal number as we prefixing with 0 and octal digits are allowed from 0 to 7 only
		int k = 0777; //valid
		int x1 = 0xFace;//valid
		int x2 = 0xBeef; //valid
		//int x3 = 0xBeer; //invalid because r is not allowed

	}

}
