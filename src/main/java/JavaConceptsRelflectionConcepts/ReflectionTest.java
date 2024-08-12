package JavaConceptsRelflectionConcepts;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionTest {

	public static void main(String[] args) {
		//Getting constructor of the class
		try {
		Class<?> c = Class.forName("JavaConceptsRelflectionConcepts.Person");
		System.out.println("--------Getting constructor of the class----------");
		Constructor<?>[] constructors = c.getConstructors();
		System.out.println("constructors:"+Arrays.toString(constructors));
		
		//Getting all methods even inherited of the class
		System.out.println("--------Getting all methods even inherited of the class----------");
		Method[] methods = c.getMethods();
		System.out.println("Methods:"+Arrays.toString(methods));
		
		//Getting methods of the class
		System.out.println("--------Getting methods of the class----------");
		Method[] declaredMethods = c.getDeclaredMethods();
		System.out.println("DeclaredMethods:"+Arrays.toString(declaredMethods));
		
		//Getting fields of the class
		System.out.println("--------Getting fields of the class----------");
		Field[] declaredFields = c.getDeclaredFields();
		System.out.println("DelcareFields:"+Arrays.toString(declaredFields));
		
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		}
}
