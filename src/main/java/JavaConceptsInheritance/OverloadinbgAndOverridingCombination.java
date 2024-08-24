package JavaConceptsInheritance;

import java.io.IOException;

class Poo{
	
	public void m1(int i) throws IOException{}
}

class Coo extends Poo{
	//overriding
	//public void m1(int i) {}
	
	//Overlaoding
	//public static int m1(long s) {return 0;}
	
	//Overiding - invalid we are trying to do with static method
	//public static void m1(int i) {}
	
	//Overriding - invalid - child throwing exception but parent not throwing exception
	//public void m1(int i) throws Exception{}
	
	//Overriding - invalid due to illegal combination of static and abstract
	//public static abstract void m1(double d);
	
	//Overloading - valid
	//public abstract void m1(double d) ;
	
}
public class OverloadinbgAndOverridingCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
