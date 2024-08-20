package JavaConceptsInterfacesConcept;
interface interf1{
	void m1();
}
interface interf2{
	int m1();
}
//CE: It is impossible to implement both interface simultaneously if return types are not covariant
//public class TwoInterfceSameMethod implements interf1,interf2 {

//	@Override
//	public int m1() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	
//	@Override
//	public void m1() {
//		
//	}

//}
