package JavaConceptsInheritance;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class va {
	public void m1() throws IOException {}
}

class ia extends va{
	public void m1() throws ArithmeticException,NullPointerException,ClassCastException{
		
	}
}

//If a child class method throws any checked exception then compulsory parent class method should throw the same checked exception or it's parent
//Otherwise we will get compile time error

//1 valid: p: m1() throws Exception and c: m1() throws no exception
//2. Invalid p: m1() throws no Exception nad c: m1() throws Exception
//3. valid: p: m1() throws Exception and c: m1() throws IOException
//4. invalid: p: m1( )throws IOException and c: m1() throws Exception
//5. Valid: p: m1() throws IO Exception and c: m1() throws FileNotFoundException and EOFException
//6. Invalid:p:m1() throws IOException and c: m1() throws EOF Exception and Interrupted Exception

//There are no restrictions for unchecked exceptions- No comparison required for unchecked exception
//7. valid: p:m1() throws IOException c:m1() throws AE,NPE,CCE
public class MethodOverridingExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
