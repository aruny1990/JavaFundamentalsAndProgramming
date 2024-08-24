package JavaConceptsInheritance;

public class MethodOverloadingDemo4 {

	public void m1(int i, float f) {
		System.out.println("int float version");
	}
	
	public void m1(float f, int i) {
		System.out.println("float int version");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloadingDemo4 t = new MethodOverloadingDemo4();
		t.m1(10.5f, 10);
		t.m1(10, 10.5f);
		//Refernce to m1() is ambiguous
		//t.m1(10, 10); //CE
		//Cannot find symbol method m1(float,float)
		//t.m1(10.5f,10.5f); //CE
	}

}
