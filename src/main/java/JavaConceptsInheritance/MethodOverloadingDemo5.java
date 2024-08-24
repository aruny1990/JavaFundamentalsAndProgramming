package JavaConceptsInheritance;

public class MethodOverloadingDemo5 {

	public void m1(int i) {
		System.out.println("Generic method");
	}
	
	public void m1(int... i) {
		System.out.println("var arg method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingDemo5 md = new MethodOverloadingDemo5();
		md.m1();
		md.m1(10,20);
		md.m1(10); //Valid - Generic method will get chance because there is an exact match and it came in 1.0 v but var arg came in 1.4v so old will get the chance
	}

}
