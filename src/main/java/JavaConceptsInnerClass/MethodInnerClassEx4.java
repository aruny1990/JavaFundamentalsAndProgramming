package JavaConceptsInnerClass;

class MethodInnerClassEx4 {

	public void m1() {
		int x=10;
		x =10; //CE: Local variable x defined in an enclosing scope must be final or effectively final
		class Innerclass{
			public void m2() {
				//System.out.println(x);
			}
		}
		Innerclass i = new Innerclass();
		i.m2();
	}
	
	public static void main(String[] args) {
		MethodInnerClassEx4 ms = new MethodInnerClassEx4();
		ms.m1();
	}
}
