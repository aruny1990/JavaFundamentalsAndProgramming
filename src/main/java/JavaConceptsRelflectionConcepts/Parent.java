package JavaConceptsRelflectionConcepts;

public class Parent {

	private String name;
	
	Parent(String name){
		this.name=name;
	}
	
	public void displayName() {
		System.out.println(name);
	}
	
	public String getName() {
		return name;
	}
}
