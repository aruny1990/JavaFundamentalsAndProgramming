package JavaConceptsInterfacesConcept;
interface M{
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
}
//Adapter class is 
abstract class Test implements M{

	public  void m1() {}
	public  void m2() {}
	public  void m3() {}
	public  void m4() {}
	public  void m5() {}
}

public class AdapterTest extends Test{
	public void m3() {}
}