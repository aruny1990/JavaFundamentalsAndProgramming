package JavaConceptsConstructorsInJava;

public class UsingSuperAndThisInMethod {

	public void m1() {
		//super(); //CE: Constructor call must be the first statement in a constructor
		//this(); //CE: Constructor call must be the first statement in a constructor
		System.out.println("this is method");
	}
	
	public static void main(String[] args) {
		UsingSuperAndThisInMethod u = new UsingSuperAndThisInMethod();
		u.m1();
	}
}
