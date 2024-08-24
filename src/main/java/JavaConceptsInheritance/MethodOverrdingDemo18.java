package JavaConceptsInheritance;
class Par1{
	int x = 888;
}

class car1 extends Par1{
	int x = 999;
}
public class MethodOverrdingDemo18 {
//1 . p : variable non static and c: variable non static
//2 . p: static c: non static
//3. p: non static and c: static
//4. p: static and c: static 
	
//If varaible is static or non static or vice versa or any combination in all cases it is handled by compiler based on reference type
	public static void main(String[] args) {
		
		//Method overriding is only applicable for methods it is not applicablew for variable
		//Variable resolution is always take care by compiler based on reference type
		Par1 p = new Par1();
		System.out.println(p.x);
		car1 c = new car1();
		System.out.println(c.x);
		Par1 p1 = new car1();
		System.out.println(p1.x);
	}
}
