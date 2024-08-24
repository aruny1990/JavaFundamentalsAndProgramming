package JavaConceptsInheritance;
class ma{
	public void m1() {
		System.out.println("Parent class m1() method");
	}
}

class ck extends ma{
	public final void m1() {
		System.out.println("Child class m1() final method");
	}
}
public class MethodOverridingDemo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ma m = new ma();
		m.m1();
		ck c = new ck();
		c.m1();
		ma d = new ck();
		d.m1();
	}

}
