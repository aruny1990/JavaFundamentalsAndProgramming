package JavaConceptsInterfacesConcept;
interface x{
	void m1();
}
interface y{
	void m1(int i);
}
public class TwoInterfaceWithSameMethodButDifferntParameters implements x,y {

	@Override
	public void m1(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

}
