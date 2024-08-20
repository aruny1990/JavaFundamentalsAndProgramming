package JavaConceptsConstructorsInJava;
class ParentConstructor{
	protected ParentConstructor() {
		System.out.println("This is Parent constructor");
	}
}

class Test extends ParentConstructor{
	public Test() {
		super();
		System.out.println("This is child constructor");
	}
}
public class ChildConstructor {

	public static void main(String[] args) {
		Test t = new Test();
	}
	}
