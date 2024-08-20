package JavaConceptsInterfacesConcept;
abstract interface interfD{
	//int x; //CE
	public static final int x=10;
	abstract void m1();
}
interface interf{
	void m1();
	void m2();
}

interface interfB{
	void m3();
	
}

interface interfA extends interf, interfB{
	void m4(); 		
}
public abstract class A9 implements interf {

	public void m1() {
		
	}
	
}

class B9 extends A9{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}
