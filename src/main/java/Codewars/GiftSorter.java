package Codewars;



import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class GiftSorter {

	public String sortGiftCode(String code) {
		// Put code here!
		char[] charArr = code.toCharArray();
		Arrays.sort(charArr);
		String str = "";
		

		for(int i=0;i<charArr.length;i++) {
			str += Character.toString(charArr[i]);
		}
		
		return str;
	}

	@Test
	public void Tests1() throws Exception {
		GiftSorter gs = new GiftSorter();
		assertEquals("abcdef", gs.sortGiftCode("fedcba"));
	}

	@Test
	public void Tests2() throws Exception {
		GiftSorter gs = new GiftSorter();
		//assertEquals("reverse alphabet", "abcdefghijklmnopqrstuvwxyz", gs.sortGiftCode("zyxwvutsrqponmlkjihgfedcba"));
	}
}
