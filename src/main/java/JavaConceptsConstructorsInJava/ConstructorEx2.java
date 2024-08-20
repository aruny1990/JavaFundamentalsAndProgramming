package JavaConceptsConstructorsInJava;

class ParentCons {
	ParentCons() {
		System.out.println("This is Parent constructor");
	}
}

class ChildCon extends ParentCons {

}

public class ConstructorEx2 {
	public static void main(String[] args) {
		//By default the default cons will call super(); which is no-arg call
		ChildCon c = new ChildCon();
	}
}
