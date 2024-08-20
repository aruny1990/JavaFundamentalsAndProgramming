package JavaConcepts.DeclarationAndAccessModifiers;

public class StaticAndInstanceVaraiable {

	static int x=10;
	int y=20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticAndInstanceVaraiable s1 = new StaticAndInstanceVaraiable();
		s1.x=30;
		s1.y=40;
		System.out.println("x is "+s1.x+"y is "+s1.y);
		StaticAndInstanceVaraiable s2 = new StaticAndInstanceVaraiable();
		System.out.println("x is "+s2.x+"y is "+s2.y);
				
	}

}
