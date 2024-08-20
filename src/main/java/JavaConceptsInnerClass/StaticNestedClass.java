package JavaConceptsInnerClass;
class StaticNestedClass {
	static class Nested{
		public void m1() {
			System.out.println("static nested class method");
		}
	}
	public static void main(String[] args) {
		Nested n = new Nested();
		n.m1();
	}
}
