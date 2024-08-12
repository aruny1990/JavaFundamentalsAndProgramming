package JavaConceptsRelflectionConcepts;

import java.lang.reflect.Field;

public class ReflectionTest4 {

	public static void main(String[] args)  {
		try {
		Class<?> cls = Class.forName("JavaConceptsRelflectionConcepts.Welcome2");
		Field field = cls.getDeclaredField("message");
		field.setAccessible(true);
		Object object = field.get(new Welcome2());
		String result = (String)object;
		System.out.println("result is "+result);
		}catch(ClassNotFoundException | NoSuchFieldException| SecurityException | IllegalArgumentException|IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
