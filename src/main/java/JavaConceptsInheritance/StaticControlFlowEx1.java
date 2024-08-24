package JavaConceptsInheritance;

public class StaticControlFlowEx1 {

static int i=10;
	
	static {
		m1();
		System.out.println("First static block");
	}
	
	public static void m1() {
		System.out.println(j);
	}
	
	static {
		System.out.println("second static block");
	}
	
	static int j = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//m1();
		//System.out.println("main method");
	}

}
