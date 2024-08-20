package JavaConcepts.DeclarationAndAccessModifiers;

public class FinalLocalVariable {

	public static void main(String[] args) {
		//Local variable scope is fixed in the block only
		// only modifier applicable is final
		 int x; //No CE
		 final int y; //No CE
		 //static int z; //CE: Illegal modifier
		//System.out.println(x); //CE: x might not have initialized
		//System.out.println(y); //CE:x might not have initialized
		//System.out.println(z);
	}
}
