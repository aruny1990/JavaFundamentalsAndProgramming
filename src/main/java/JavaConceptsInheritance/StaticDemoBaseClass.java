package JavaConceptsInheritance;

public class StaticDemoBaseClass {

	static int i=10;
	
	static {
		m1();
		System.out.println("Base static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		System.out.println("Base main");
		
	}

	public static void m1() {
		System.out.println(j);
	}
	
	static int j=20;
}
