package JavaConceptsInnerClass;

class Outer6 {

	class Inner6{
		public void m1() {
			System.out.println("Inner class method");
		}
	}
}

class Test{
	public static void main(String[] args) {

		Outer6 o = new Outer6();
		Outer6.Inner6 i = o.new Inner6();
		i.m1();
	}
}