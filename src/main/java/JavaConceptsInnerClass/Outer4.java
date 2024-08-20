package JavaConceptsInnerClass;

public class Outer4 {

	class Inner4{
		public void m1() {
			System.out.println("Inner class method");
		}
		
		
	}
	
	public static void main(String[] args) {
		//1st approach
		Outer4 o = new Outer4();
		Outer4.Inner4 i = o.new Inner4();
		i.m1();
		
		//2nd approach
		new Outer4().new Inner4().m1();
		
		//3rd approach
		Outer4.Inner4 i1 = new Outer4().new Inner4();
		i1.m1();
	}
}
