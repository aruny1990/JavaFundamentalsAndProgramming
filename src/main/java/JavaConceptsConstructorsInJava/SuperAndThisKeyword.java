package JavaConceptsConstructorsInJava;
class P{
	String s = "Parent class";
}

class C extends P{
	String s = "Child class";
	
	public void m1() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
	}
	
}
public class SuperAndThisKeyword {
public static void main(String[] args) {
	C c = new C();
	c.m1();
	}
}
