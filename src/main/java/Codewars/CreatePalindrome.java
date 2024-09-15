package Codewars;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class CreatePalindrome {

	public static boolean solve(String s) {
        return isPalindromePossible(s);
    }

    private static boolean isPalindromePossible(String s) {
        int n = s.length()-1;
        
        for(int i=0;i<n/2;i++) {
        	char left = s.charAt(i);
        	char right = s.charAt(n-i);
        	
        	if((left!=right) && Math.abs(left-right)!=2) {
        		return false;
        	}
        	
        	
        }
        return true;
        
    }

	
	@Test
	public void basicTest4() {
		//assertEquals(true,CreatePalindrome.solve("abccba"));
		 assertEquals(true,CreatePalindrome.solve("kxbkwgyydkcbtjcosgikfdyhuuprubpwthgflucpyylbofvqxkkvqthmdnywpaunfihvupbwpruwfybdmgeuocltdaidyyewmbzm"));

	}
	
	
}
