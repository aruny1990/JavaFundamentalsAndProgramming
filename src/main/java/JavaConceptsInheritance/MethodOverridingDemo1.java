package JavaConceptsInheritance;

class Parent{
	public void property() {
		System.out.println("Cash+land+Gold");
	}
	
	public void marry() {
		System.out.println("Subba laxmi");
	}
}

class Child extends Parent{
	
	public void marry() {
		System.out.println("Trisha/Charmi/Nayanthara");
	}
}
public class MethodOverridingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p = new Parent();
		p.marry();
		
		Child c = new Child();
		c.marry();
		
		//In overriding method resolution is always based on runtime object
		Parent p1 = new Child();
		p1.marry();
	}

}
