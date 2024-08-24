package JavaConceptsInheritance;
class Paja{
	
	public static void m1() {
		System.out.println("Parent class m1() static method");
	}
}

class Caja extends Paja{
	public static void m1() {
		System.out.println("child class m1() static method");
	}
}
public class MethodOverridingDemo8 {

	/*
In Java, static methods belong to the class 
rather than instances of the class, and they 
are not subject to inheritance in the same 
way as instance methods. This means that static
 methods cannot be overridden in the way that
  instance methods can. However, you can hide a
   static method in a subclass by declaring a 
   new static method with the same name in the
    child class.
*/
	public static void main(String[] args) {
		Paja p = new Paja();
		p.m1();
		Caja c = new Caja();
		c.m1();
		Paja p1 = new Caja();
		p1.m1();
	}
}
