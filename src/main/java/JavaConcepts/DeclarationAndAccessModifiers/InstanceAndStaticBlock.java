package JavaConcepts.DeclarationAndAccessModifiers;

public class InstanceAndStaticBlock {

	static {
		System.out.println("This is static block");
	}
	
	{
		System.out.println("This is instance block");
	}
	
	void m1() {
		System.out.println("This is instance method");
	}
	
	static void m2() {
		System.out.println("This is static method");
	}
	public static void main(String[] args) {
		InstanceAndStaticBlock ib = new InstanceAndStaticBlock();
		ib.m1();
		ib.m2();
	}
}
