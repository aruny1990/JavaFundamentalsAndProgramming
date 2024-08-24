package JavaConceptsInheritance;
class Pa{
	
	public Object m1() {
		System.out.println("Object Type");
		return null;
	}
}

class Ch extends Pa{
	public String m1() {
		System.out.println("String Type");
		return null;
	}
}
public class MethodOverridingDemo2 {

	//Rules for Overriding:
	//Method name and argument type must be same
	//But in overloading method signature should be ddifferent
	//From 1.5 v covariant return types are also allowed for overriding
	//Covariant return types are only applicable for Object type only not pirmitive type
	//In covariant return type in Parent return type should be String and Child should not be Object becuase it is not covvariant as Object is superclass and String is sbuclass
	//Number - Number/Integer/Double/Character - Valid
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pa p = new Pa();
		p.m1();
		Ch c = new Ch();
		c.m1();
		Pa p1 = new Ch();
		p1.m1();
		//Ch c1 = new Pa();//CE: cannot from parent to child
	}

}
