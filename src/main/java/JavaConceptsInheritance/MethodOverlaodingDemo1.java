package JavaConceptsInheritance;

public class MethodOverlaodingDemo1 {

	//Overloading - Having same name but different argument typess
	public void m1() {
		System.out.println("no args");
	}
	
	public void m1(int i) {
		System.out.println("int args");
	}
	
	public void m1(float d) {
		System.out.println("float args");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverlaodingDemo1 md = new MethodOverlaodingDemo1();
		md.m1();
		md.m1(10);
		md.m1(10.5f);
		md.m1('a');
		md.m1(10l);
		//md.m1(10.5); //CE: Double is not applicable for int, float
	}

}
