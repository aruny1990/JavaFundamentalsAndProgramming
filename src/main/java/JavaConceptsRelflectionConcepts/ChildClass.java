package JavaConceptsRelflectionConcepts;
@Deprecated
public class ChildClass extends Parent implements IntTest {

	private int value;
	ChildClass(String name, int value) {
		super(name);
		this.value = value;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showValue() {
		// TODO Auto-generated method stub
		System.out.println("Value:"+value);
	}

}
