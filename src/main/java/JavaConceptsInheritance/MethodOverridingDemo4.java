package JavaConceptsInheritance;
class Po{
	public final void m1() {
		
	}
}

class co extends Po{
	//CE: Cannot override the final method from P1
//	public void m1() {
//		
//	}
}
public class MethodOverridingDemo4 {

	//We can't override Parent classes with final method the nwe will get compile time error
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
