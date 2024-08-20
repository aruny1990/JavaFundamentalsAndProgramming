package JavaConceptsInnerClass;
class Popcorn{
	public void taste() {
		System.out.println("Salty");
	}
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		Popcorn p = new Popcorn() {
			public void taste() {
				System.out.println("spicy");
			}
		};
		
		p.taste();
		
		System.out.println(p.getClass().getName());
		
		Popcorn p1 = new Popcorn();
		p1.taste();
		
		System.out.println(p1.getClass().getName());
		Popcorn p2 = new Popcorn() {
			public void taste() {
				System.out.println("sweet");
			}
		};		
		
		p2.taste();
		System.out.println(p2.getClass().getName());
	}
}
