package JavaConceptsInheritance;

public class MethodOverloadingDemo2 {

	public void m1(String s) {
		System.out.println("String version");
	}
	
	public void m1(Object o) {
		System.out.println("Object version");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloadingDemo2 t = new MethodOverloadingDemo2();
		t.m1(t);
		t.m1("durga");
		//String version is called String is the child and Object is parent but child level is having priority first
		t.m1(null); //null is valid value of string and object both
	}

}
