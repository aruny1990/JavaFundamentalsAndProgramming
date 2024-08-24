package JavaConceptsInheritance;
class iav{
	public void m1(int... x) {
		System.out.println("Parent");
	}
}

class tam extends iav{
	public void m1(int x) {
		System.out.println("child");
	}
}
public class MethodOverridingDemo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//This is overloading because we have differnt argument type
		//we can override var arg method with var arg method only
		iav p = new iav();
		p.m1(10);
		tam c = new tam();
		c.m1(10);
		iav p1 = new tam();
		p1.m1(10);
	}

}
