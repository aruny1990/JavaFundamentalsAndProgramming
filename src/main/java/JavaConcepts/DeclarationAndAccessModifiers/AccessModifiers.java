package JavaConcepts.DeclarationAndAccessModifiers;

public class AccessModifiers {
	
	public static final void m2() {
		
	}
	final int x;
	//We can define non static final members either in instance block or constructor before object initlization
//	{
//		x=0;
//	}
	
	  AccessModifiers(){ x=0; }
	 
	public static void main(String[] args) {
		AccessModifiers am = new AccessModifiers();
		System.out.println(am.x);
		
		}

}