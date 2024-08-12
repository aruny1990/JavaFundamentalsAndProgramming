package JavaConceptsRelflectionConcepts;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;



public class ReflectionTest1 {

	public static void main(String[] args) {
		System.out.println("------1. To get the class name------");
		Class<?> c1;
		try {
			c1 = Class.forName("JavaConceptsRelflectionConcepts.ChildClass");
			System.out.println("class name: "+c1.getName());
			System.out.println("class name: "+c1.getSimpleName());
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//2. Getting super class using reflection
		System.out.println("-------2.Getting super class using reflection----");
		Class<?> c2;
		try {
			c2 = Class.forName("JavaConceptsRelflectionConcepts.ChildClass");
			System.out.println("class name: "+c2.getSuperclass());

		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//3. Getting implemented or extended interface using reflection
		System.out.println("------3. Getting implemented or extended interface using reflection---------");
		Class<?> c3;
		try {
			c3 = Class.forName("JavaConceptsRelflectionConcepts.ChildClass");
			System.out.println("interfaces: "+Arrays.toString(c3.getInterfaces()));
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//4. Getting class modifiers using reflection
		System.out.println("----4. Getting class modifiers using reflection--------");
		Class<?> c4;
		try {
			c4 = Class.forName("JavaConceptsRelflectionConcepts.ChildClass");
			int modifiers = c4.getModifiers();
			System.out.println("Modifier: "+Modifier.toString(modifiers));
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//5. Getting fields of the class using reflection
		System.out.println("----5. Getting fields of the class using reflection------");
		Class<?> c5;
		try {
			c5 = Class.forName("JavaConceptsRelflectionConcepts.ChildClass");
			Field[] allFields = c5.getFields();
			System.out.println("All fields: "+Arrays.toString(allFields));
		
		//Getting fields of the class
			Field[] fields = c5.getDeclaredFields();
			System.out.println("Fields: "+Arrays.toString(fields));
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}		
		
		//6 .Getting constructors of the class using reflection
		System.out.println("---6.Getting constructors of the class using reflection----- ");
		Class<?> c6;
		try {
			c6 = Class.forName("JavaConceptsRelflectionConcepts.ChildClass");
			 Constructor<?>[] constructors = c6.getConstructors();
			System.out.println("Constructors: "+Arrays.toString(constructors));
		
		//Getting fields of the class
		 Constructor<?>[] deConstructors = c6.getDeclaredConstructors();
			System.out.println("Declared constructors: "+Arrays.toString(deConstructors));
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}	
		
		//7. Getting methods of the class using reflection
		System.out.println("---7.Getting methods of the class using reflection----- ");
		Class<?> c7;
		try {
			c7 = Class.forName("JavaConceptsRelflectionConcepts.ChildClass");
			 Method[] methods = c7.getMethods();
			System.out.println("All Methods: "+Arrays.toString(methods));
		
		//Getting fields of the class
			methods = c7.getDeclaredMethods();
			System.out.println("Class methods: "+Arrays.toString(methods));
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}	
		
		//8. Getting annotations using reflection
		System.out.println("---8. Getting annotations using reflection----- ");
		Class<?> c8;
		try {
			c8 = Class.forName("JavaConceptsRelflectionConcepts.ChildClass");
			 Annotation[] annotations = c8.getAnnotations();
			System.out.println("Annotations: "+Arrays.toString(annotations));
		
		//Getting fields of the class
			Annotation[] declaredAnnotations = c8.getDeclaredAnnotations();
			System.out.println("Declared Annotations: "+Arrays.toString(declaredAnnotations));
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}	
		
	}
}
