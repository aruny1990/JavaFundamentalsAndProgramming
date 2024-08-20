package JavaConceptsInnerClass;

class MethodInnerClassExample2 {

	int x =10;
	static int y = 20;
	public void m1() {
		class InnerMethod{
			public void m2() {
				System.out.println(x);
				System.out.println(y);
			}
		}
		InnerMethod i = new InnerMethod();
		i.m2();
	}
	
	public static void main(String[] args) {
		MethodInnerClassExample2 ms = new MethodInnerClassExample2();
		ms.m1();
	}
}
