package JavaConcepts.DeclarationAndAccessModifiers;

public class StaticMethod {

	static int i;
	int j;
	static {
		i=0;
		i++;
	}
	
	{
		
		j=0;
		j++;
	}
	
	
	
	public static void main(String[] args) {
		//m1();
		StaticMethod sm1 = new StaticMethod();
		StaticMethod sm2 = new StaticMethod();
		System.out.println(i);
		System.out.println(sm1.j);
		System.out.println(i);
		System.out.println(sm2.j);
	}

	public  void m1() {
		//public , private, protected , static , default not allowed only final is permitted 
		final int i =0;
		
		// TODO Auto-generated method stub
		
	}
}
