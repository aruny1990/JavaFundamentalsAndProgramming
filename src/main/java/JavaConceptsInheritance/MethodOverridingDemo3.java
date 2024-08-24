package JavaConceptsInheritance;
class Par{
	public Number m1() {
		System.out.println("Number method");
		return 0.0;
	}
}

class Chi extends Par{
	public Integer m1() {
		System.out.println("Integer method");
		return 0;
	}
	
	//Double - Integer not valid
	//Number - Double valid
	///Number - Integer valid
}
public class MethodOverridingDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
