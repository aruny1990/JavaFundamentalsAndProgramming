package JavaConceptsInheritance;
class Animal{
	
}

class Monkey extends Animal{
	
}
public class MethodOverloadingDemo6 {
	public void m1(Animal a) {
		System.out.println("Animal Version");
	}
	
	public void m1(Monkey m) {
		System.out.println("Monkey version");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloadingDemo6 md = new MethodOverloadingDemo6();
		Animal a = new Animal();
		md.m1(a);
		Monkey m = new Monkey();
		md.m1(m);
		//Output: Animal version because compiler called method based on reference type in overloading
		Animal a1 = new Monkey();
		md.m1(a1);
		
		
		
		
		
		
		
		
	}

}
