package JavaConcepts;

public class OutputFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10000;
		System.out.printf("%,d",a);
		System.out.println();
		
		//decalring double
		double b = 3.14159265359;
		System.out.println(b);
		System.out.printf("%f",b);
		System.out.println();
		System.out.printf("%5.3f",b);
		System.out.println();
		
		//boolean
		Boolean c =true, d = false;
		Integer e = null;
		
/*		%b is a format specifier for boolean values.
 *		When %b is used with a non-boolean argument 
 * (like an integer), it prints true if the argument 
 * is non-null and not equal to zero, and false 
 * otherwise*/
		System.out.printf("%b\n",a);
		
		/*
		 * %B is a format specifier similar to %b, but it converts the output to
		 * uppercase.
		 */
		System.out.printf("%B\n",c);
		System.out.printf("%b\n",d);
		System.out.printf("%B\n",e);
		
		
		
		

	}

}
