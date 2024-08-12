package JavaConceptsRelflectionConcepts;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class CreateInstanceUsingReflectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class<?> cls;
		try {
			cls = Class.forName("JavaConceptsRelflectionConcepts.TestClass");
			Constructor<?>[] cons = cls.getDeclaredConstructors();
			for(Constructor<?> con:cons) {
				System.out.println("Constructor: "+con.getName());
				try {
					TestClass testClass;
					if(Modifier.toString(con.getModifiers()).equals("private")) {
						con.setAccessible(true);
						testClass = (TestClass)con.newInstance();
						
					}else {
						testClass = (TestClass) con.newInstance(200,"ConstructorTest");
					}
					testClass.showValue();
				}catch(InstantiationException |IllegalAccessException|IllegalArgumentException|InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
