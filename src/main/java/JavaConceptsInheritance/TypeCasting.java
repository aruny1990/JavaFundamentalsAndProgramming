package JavaConceptsInheritance;

public class TypeCasting {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 We can hold child class object using parent class reference
		Object o = new String("durga");
		
		//2. We can use interface reference to hold implemented class object
		Runnable r = new Thread();
		
		//RE: ClassCastException: class java.lang.String cannot be cast to class java.lang.StringBuffer (java.lang.String and java.lang.StringBuffer are in module java.base of loader 'bootstrap')
		StringBuffer sb = (StringBuffer)o;
		
		//A b = (C)d;
		//Mantra 1: Compile Time checking 1: The types of 'd' and 'C' 
		//must have some relation either child to parent or parent to child or same type
		//Otherwise we will get compile time error saying incovertible type 
		//found: d type require: C
		
		//Ex2: CE: found: java.lang.string required: java.lang.StringBuffer
		String s = new String("durga");
		//StringBuffer sb = (StringBuffer)s;
		//Mantra 2: C must be either same or derived type of A otherwise we will get 
		//CE: saying incompatible types found: C required: A
		
		//Ex:1: valid compilation object and stringbuffer has relation
		//Object o1 = new String("durga");
		//StringBuffer sb1 = (StringBuffer)o1;
		//A b = (C)d;
		//StringBuffer sb2 = (String)o; //CE: incompatible types found: java.lang.string required: java.lang.StringBuffer
		//Mantra 3: Run time Checking: underlying object type of 'd' must be either same or derived type of 'c' otherwise we will get runtime error saying classcast exception.
	
		
		//Valid at CT and RT
		Object o2 = new String("durga");
		String o3 = (String)o;
		Object o4 = (String)o;
		
		System.out.println(o3);
	}

}
