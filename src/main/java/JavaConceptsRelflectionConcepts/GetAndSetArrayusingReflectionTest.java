package JavaConceptsRelflectionConcepts;

import java.lang.reflect.Array;

public class GetAndSetArrayusingReflectionTest {

	public static void main(String[] args) {
		double[] doubleArray = (double[])Array.newInstance(double.class, 5);
		System.out.println("Length of array:"+doubleArray.length);
		
		//Setting values using setDouble and set methods
		System.out.println("------Setting values using setDouble and set methods------------");
		Array.setDouble(doubleArray, 0, 15.0);
		Array.set(doubleArray, 1, 29.0);
		Array.setDouble(doubleArray, 2, 45.0);
		
		//Getting values using getDouble and get methods
		System.out.println("-----Getting values using getDouble and get methods-------");
		System.out.println("First element:"+Array.get(doubleArray,0));
		System.out.println("Second element:"+Array.getDouble(doubleArray,1));
		System.out.println("Third element:"+Array.getDouble(doubleArray,2));
		System.out.println("Fourth element:"+Array.getDouble(doubleArray,3));
	}
}
