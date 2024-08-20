package JavaConceptsInterfacesConcept;
interface left{
	int x = 10;
}

interface right{
	int x =20;
}
public class TwoInterfaceWithSameVariable implements left,right{

	public static void main(String[] args) {
		//System.out.println(x); //CE: The field is ambiguous
		System.out.println(left.x);
		System.out.println(right.x);
	}
}
