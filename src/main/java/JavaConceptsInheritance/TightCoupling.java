package JavaConceptsInheritance;

//Loose coupling and high cohesion are good programming practice
//Cohesion means separating view component from model( which has business logic) and controller
//High cohesion is always good programming practice because it has several advantages
//1. Without effecting remaining components we can modify hence enhacement will become easy
//2. It promotes reusability of the code (Wherever validation is required we can reuse the same validate servlet without rewriting
//3. It improves maintainability of the application
class A{
	static int i = B.j;
}

class B{
	static int j=Cava.k;
}

class Cava{
	static int k = D.m1();
}

class D{
	public static int m1() {
		return 10;
	}
}
//Tightly coupling is the worst programming practice because dependency is there
public class TightCoupling {

}
