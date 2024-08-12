package JavaConceptsRelflectionConcepts;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class ReflectionConstructorTest {

	public static void main(String[] args) {
		try {
			Class<?> cls = Class.forName("JavaConceptsRelflectionConcepts.TestClass");
			System.out.println("-------1. To get the constructor with 2 args-----------");
			Constructor<?> constructor = cls.getConstructor(int.class,String.class);
			System.out.println("constructor: "+constructor.toString());
			
			//2. Getting constructors of the class
			System.out.println("-------2. Getting constructors of the class--------");
			Constructor<?>[] constructors = cls.getConstructors();
			System.out.println("constructors: "+Arrays.toString(constructors));
			
			//3. TO get the private constructor using getDeclaredConstructor() method
			System.out.println("-------3. To get the private construcotr using getDeclaredConstructor-----");
			constructor  = cls.getDeclaredConstructor();
			System.out.println("constructor: "+constructor);
			
			//4. To get all public, protected, private, default constructors
			System.out.println("---------4.To get all public, protected, private, default constructors--------- ");
			Constructor<?>[] constructors2 = cls.getDeclaredConstructors();
			System.out.println("Decalred constructors: "+Arrays.toString(constructors2));
			
		} catch (ClassNotFoundException | NoSuchMethodException| SecurityException e) {

		}

	}
}
