package JavaConceptsInnerClass;

interface outerInterface{
	public void m1();
	interface innerInterface{
		public void m2();
	}
}
class Test4 implements outerInterface{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("outer interface method implementation");
	}

}
 
class Test2 implements outerInterface.innerInterface{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("inner method implementation");
	}
	
}

class TestNestedInterface{
	public static void main(String[] args) {
		Test4 t1 = new Test4();
		t1.m1();
		Test2 t2 = new Test2();
		t2.m2();
	}
}