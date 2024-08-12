package Codewars;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class findD {
  
	public static void main(String[] args) {
	
	System.out.println(alphabet(new long[] {2L, 3L, 4L, 1L, 12L, 6L, 2L, 4L}));
	
	System.out.println(alphabet(new long[] {2L, 6L, 7L, 3L, 14L, 35L, 15L, 5L}));
	
	System.out.println(alphabet(new long[] {20L, 10L, 6L, 5L, 4L, 3L, 2L, 12L}));
		
	System.out.println(alphabet(new long[] {2L, 6L, 18L, 3L, 6L, 7L, 42L, 14L}));
	System.out.println(alphabet(new long[] {7L, 96L, 8L, 240L, 12L, 140L, 20L, 56L}));

	System.out.println(alphabet(new long[] {20L, 30L, 6L, 7L, 4L, 42L, 28L, 5L}));
		 
	}
	  public static long alphabet(long[] ns) {
		    Arrays.sort(ns);
		    return ns[7] / (ns[0] * ns[1] == ns[2] ? ns[3] : ns[2]);
//12/(3)=4  //35/5 =7 //20/4=5
	  }
 //https://github.com/ParanoidUser/codewars-handbook/blob/main/kata/7-kyu/the-alphabet-product/main/Kata.java
}