package JavaConceptsInheritance;
class Paj{
	protected void m1() {
		System.out.println("Parent m1() method");
	}
}

class Caj extends Paj{
	//If parent method is public child class access modifier should not be less eg protected etc.
	//But if parent class method is protected we can declare child class method as public
	
	public void m1() {
		System.out.println("Child class m1() method");
	}
}
public class MethodOverridingDemo7 {

	public static void main(String[] args) {
		Paj p = new Paj();
		p.m1();
		Caj c = new Caj();
		c.m1();
		Paj p1 = new Caj();
		p1.m1();
	}
}

