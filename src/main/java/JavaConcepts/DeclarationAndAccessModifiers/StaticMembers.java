package JavaConcepts.DeclarationAndAccessModifiers;

public class StaticMembers {

	//We can declare static member in a static block
	static final int x;
	static {
		x=0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(x);
	}

}
