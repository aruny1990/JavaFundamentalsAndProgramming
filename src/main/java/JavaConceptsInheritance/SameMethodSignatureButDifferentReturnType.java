package JavaConceptsInheritance;

public class SameMethodSignatureButDifferentReturnType {

	//Same method signature and different return tpe not allowed
	public void m1(int i) {
		System.out.println("In the void m1() method");
	}
	
	//CE: m1() is already defined or duplicate m1() method
//	public int m1(int i) {
//	
//		return 0;
//	}
	
	public static void main(String[] args) {
		SameMethodSignatureButDifferentReturnType sm = new SameMethodSignatureButDifferentReturnType();
		sm.m1(0);
	}
	
	
}
