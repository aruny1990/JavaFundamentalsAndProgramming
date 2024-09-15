package JavaConceptsInheritance;

public class StaticBlockEx8 {

	static StaticBlockEx8 t = new StaticBlockEx8();
	
	StaticBlockEx8(){
		System.out.print("Hello I can print");
		System.exit(0);
	}
	
	
	public static void main(String[] args) {
		// StaticBlockEx8 t = new StaticBlockEx8();
		System.out.println(t);
	}
}
