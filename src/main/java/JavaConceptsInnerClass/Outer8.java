package JavaConceptsInnerClass;

class Outer8 {

	int x =10;
	class Inner8{
		int x =100;
		public void m1() {
			int x =1000;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Outer8.this.x);
		}
	}
	
	public static void main(String[] args) {
		new Outer8().new Inner8().m1();
	}
}
