package Programs;


class Person{
	 static int empId=1;
	 int myEmpId;
	String name;
	
//	 static{
//	
//		empId++;
//	}
	Person(String name){
		this.name = name;
		this.myEmpId=empId++;
	}
	
	void display() {
		System.out.println("name is = "+name+" employee Id is = "+myEmpId);
	}
	
}
public class Employee {
public static void main(String[] args) {
	Person p1 = new Person("Arun");
	Person p2 = new Person("Ravi");
	Person p3 = new Person("Ramesh");
	
	p1.display();
	p2.display();
	p3.display();

}
	
}
