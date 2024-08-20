package JavaConceptsInnerClass;

public class MethodInnerClassEx3 {
	int x =10;
	static int y = 20;
	public static void m1() {
		class InnerMethod1{
			public void m2() {
				//System.out.println(x); --> CE: Cannot make a static reference to the non-static field x
				System.out.println(y);
			}
		}
		InnerMethod1 i = new InnerMethod1();
		i.m2();
	}
	
	public static void main(String[] args) {
		MethodInnerClassEx3 ms = new MethodInnerClassEx3();
		ms.m1();
	}
}
