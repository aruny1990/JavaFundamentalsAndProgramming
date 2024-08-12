package JavaConceptsRelflectionConcepts;

public class TestClass {

	private int value;
	private String name;
	
	public TestClass(int value,String name) {
		this.name=name;
		this.value=value;
	}
	
	private TestClass() 
	{
		
	}
	
	public void showValue() {
		System.out.println("Name:"+name+"\t"+"Value:"+value);
	}
}
