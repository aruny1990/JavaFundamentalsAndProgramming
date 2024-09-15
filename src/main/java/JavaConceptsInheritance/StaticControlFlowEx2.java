package JavaConceptsInheritance;

public class StaticControlFlowEx2 {

	
	static {
		m1();
		//System.out.println(i); //Direct Read
	}
	
	static int i=10; //0..10
	
	public static void m1() {
		System.out.println(i); //Indirect Read
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}

}
