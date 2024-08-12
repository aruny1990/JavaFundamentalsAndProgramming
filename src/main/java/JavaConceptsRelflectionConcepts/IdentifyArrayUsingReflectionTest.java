package JavaConceptsRelflectionConcepts;

import java.lang.reflect.Field;

public class IdentifyArrayUsingReflectionTest {

	public static void main(String[] args) {
		try {
			Class<?> cls = Class.forName("JavaConceptsRelflectionConcepts.Person2");
			Field[] fields = cls.getDeclaredFields();
			for(Field f:fields) {
				Class<?> type = f.getType();
				if(type.isArray()) {
					System.out.println("Array found:"+f.getName());
				}
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
