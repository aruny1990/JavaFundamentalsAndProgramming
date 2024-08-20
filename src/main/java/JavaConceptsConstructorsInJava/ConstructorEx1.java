package JavaConceptsConstructorsInJava;

public class ConstructorEx1 {

	String name;
	int rollno;
	ConstructorEx1(String name, int rollno){
		this.name = name;
		this.rollno = rollno;
	}
	
	public static void main(String[] args) {
		ConstructorEx1 e1 = new ConstructorEx1("Durga",101);
		ConstructorEx1 e2 = new ConstructorEx1("Ravi",102);
		System.out.println(e1.name+".."+e1.rollno);
		System.out.println(e2.name+".."+e2.rollno);
	}
}
