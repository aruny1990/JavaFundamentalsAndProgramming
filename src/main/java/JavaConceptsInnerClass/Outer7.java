package JavaConceptsInnerClass;

class Outer7 {

	int x=10;
	static int y=20;
	
	class Inner7{
		public void m1() {
			System.out.println(x);
			System.out.println(y);
		}
	}
	
	public static void main(String[] args) {
		new Outer7().new Inner7().m1();
	}
}
