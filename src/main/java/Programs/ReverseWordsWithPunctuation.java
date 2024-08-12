package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsWithPunctuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "This is a selenium, please write down";
		String newOutput = "";
		List<String> newWordList = new ArrayList<String>();
		// Split the input string into words using space as a delimiter
		String[] words = input.split(",");

		// Convert the array to a list for easier manipulation
		List<String> wordList = Arrays.asList(words);
		//List<String> newWord = new ArrayList<String>();
		int counter = wordList.size();
		//System.out.println("word List is = " + wordList.get(0));
		// Reverse the order of words in the list
		for (String newWords : wordList) {
			String[] newSplit = newWords.split(" ");
			newWordList = Arrays.asList(newSplit);
			Collections.reverse(newWordList);
			for(String a:newWordList)
			{
				newOutput = newOutput+" "+a;
			}
			
			if(counter!=1) {
			newOutput=newOutput+",";
			counter=counter-1;
			}
		}
		
		
		
		System.out.println(newOutput.trim());
		//StringBuilder str = new StringBuilder(newOutput);
		//str = str.replace(0, 0, newOutput)
		//.replace(newOutput.substring(newOutput.length()-1), ""));
		/*
		 * int commaIndex = newOutput.lastIndexOf(","); System.out.println(commaIndex);
		 */
		//newOutput.charAt(commaIndex)
		//System.out.print(newOutput.replace(newOutput.substring(commaIndex-1,newOutput.length()-1), ""));
		//System.out.println(newOutput.replace(newOutput.lastIndexOf(","), ""));
		// Join the reversed words back into a single string
		// String output = String.join(" ", wordList);

		// Print the output
		//System.out.println(newOutput);
	}

}
