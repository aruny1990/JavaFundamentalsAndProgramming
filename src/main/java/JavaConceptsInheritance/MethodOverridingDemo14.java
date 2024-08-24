package JavaConceptsInheritance;
class ka{
	public void m1() {
		System.out.println("Parent m1() method");
	}
}

class ta extends ka{
	public void m1() {
		
	}
}
public class MethodOverridingDemo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ka k = new ta();
		k.m1();
	}

}
