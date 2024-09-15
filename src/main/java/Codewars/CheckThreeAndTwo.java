package Codewars;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

public class CheckThreeAndTwo {

	public static void main(String[] args) {
	       assertEquals(true, new CheckThreeAndTwo().checkThreeAndTwo(new char[] { 'a', 'a', 'b', 'b', 'b' }));
	        assertEquals(false, new CheckThreeAndTwo().checkThreeAndTwo(new char[] { 'a', 'c', 'a', 'c', 'b' }));
	        assertEquals(false, new CheckThreeAndTwo().checkThreeAndTwo(new char[] { 'a', 'a', 'a', 'a', 'a' }));
	}

	private static boolean checkThreeAndTwo(char[] chars) {
		// TODO Auto-generated method stub
		   Map<Character,Integer> myMap = new HashMap<>();
		      
		      for(char ch: chars){
		        myMap.put(ch,myMap.getOrDefault(ch,0)+1);
		      }
		      
		      int aCount = myMap.getOrDefault('a',0);
		      int bCount = myMap.getOrDefault('b',0);
		      int cCount = myMap.getOrDefault('c',0);
		      
		      return (aCount==3 && (bCount==2 || cCount==2) ||
		             bCount==3 && (aCount==2 || cCount==2) ||
		             cCount==3 && (aCount==2 || bCount==2));

	}
}
