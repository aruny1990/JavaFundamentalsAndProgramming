package JavaConceptsArrays;

public class ArrayEx1 {
public static void main(String[] args) {
	int [] x = new int[3];
	System.out.println(x.getClass().getName());
	
	byte[] b= new byte[3];
	System.out.println(b.getClass().getName());
	
	int[][] a = new int[3][2];
	System.out.println(a.getClass().getName());
	
	boolean[] b1 = new boolean[2];
	System.out.println(b1.getClass().getName());
	
	int[] a1 = new int['a'];
	System.out.println(a1.length);
	
	byte b4 = 20;
	int[] a2 = new int[b4];
	System.out.println(a2.length);
	
	short s1 = 10;
	int[] a3 = new int[s1];
	System.out.println(a3.length);
	
	//int[] a4 = new int[10l]; 
	//Type mismatch or PLP found long reqreuired int
	//System.out.println(a4.length);
}
}
