package JavaConceptsRelflectionConcepts;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest3 {

	public static void main(String[] args)  {
		try {
			Class<?> cls = Class.forName("JavaConceptsRelflectionConcepts.Welcome");
			Method method = cls.getDeclaredMethod("greet",String.class);
			method.setAccessible(true);
			Object object = method.invoke(new Welcome(), "KK");
			String result = (String) object;
			System.out.println(result);
		}catch(ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException| IllegalArgumentException| InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
