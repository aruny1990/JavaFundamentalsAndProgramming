package JavaConceptsInheritance;
class P{
	public void m1() {
		System.out.println("Parent");
	}
}

class C extends P{
	public void m2() {
		System.out.println("Child");
	}
}
public class InheritanceTest {

	public static void main(String[] args) {
	P p = new P();
	p.m1();
	//p.m2();//CE: The method m2() is undefined for the type P
	P p1 = new C();
	p1.m1();
	//p1.m2(); //CE: The method m2() is undefined for the type P
	C c = new C();
	c.m1();
	c.m2();
	//C c1 = new P();// CE: Cannot convert from child to Parent
	}
	
}
