package JavaConceptsInheritance;

class Para{
	public void m1() {
	
		System.out.println("Parent class m1() method");
	}
}

abstract class Cara extends Para{
	abstract public void m1();
	
//	public void m1() {
//		System.out.println("abstract child class");
//	}
	
}
public class MethodOverridingDemo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Advantage - Method m1 () will be available to abstract child class method we can stop availability of parent to subclasses. As child of abstract class compulsory need to provide implementation of parent
		Para p = new Para();
		p.m1();
		
		
	}

}
