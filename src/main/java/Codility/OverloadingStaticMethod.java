package Codility;

public class OverloadingStaticMethod {

	public static void m1(int i) {
		System.out.println("int method");
	}
	
	public static void m1(float f) {
		System.out.println("float method");
	}
	
	public static void main(String[] args) {
		m1(10);
		m1(10.0f);
	}
}
