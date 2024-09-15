package JavaConceptsInheritance;

public class StaticDemoDerivedClass extends StaticDemoBaseClass {

	static int x =100;
	static {
		m2();
		System.out.println("Derived First static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m2();
		System.out.println("Derived main");
	}
	
	public static void m2() {
		System.out.println(y);
	}
	
	static {
		System.out.println("Derived Second static block");
	}
	static int y=200;

}
