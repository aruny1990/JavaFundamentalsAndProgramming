package JavaConceptsRelflectionConcepts;

import java.lang.reflect.Field;
import java.util.Arrays;

public class GettersAndSettersGeneratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 Class<?> cls = Class.forName("JavaConceptsRelflectionConcepts.Person4");
			 //Getting fields of the class Person4
			 System.out.println("------Getting fields of the class Person4---------");
			 Field[] fields = cls.getDeclaredFields();
			 System.out.println("Fields: "+Arrays.toString(fields));
			 
			 StringBuffer sb = new StringBuffer();
			 System.out.println("-----All fields corresponding setter and Getter methods------");
			 for(Field field:fields) {
				 String fieldName = field.getName();
				 String fieldType = field.getType().getSimpleName();
				 System.out.println("Field Name: "+fieldName);
				 System.out.println("Field Type: "+fieldType);
				 
				 CommonUtils.createSetter(fieldName, fieldType, sb);
				 CommonUtils.createGetter(fieldName, fieldType, sb);
			 }
			 System.out.println(sb.toString());
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
