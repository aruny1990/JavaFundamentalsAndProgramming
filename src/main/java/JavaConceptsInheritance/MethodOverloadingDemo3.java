package JavaConceptsInheritance;

public class MethodOverloadingDemo3 {

	public void m1(String s) {
		System.out.println("String version");
	}
	
	public void m1(StringBuffer s) {
		System.out.println("StringBuffer version");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloadingDemo3 md = new MethodOverloadingDemo3();
		md.m1("durga");
		md.m1(new StringBuffer("durga"));
		//md.m1(null); //CE: Reference to m1() is ambiguous becuase both method matched and both method are at same level
	}

}
