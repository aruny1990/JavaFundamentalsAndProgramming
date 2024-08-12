package Codewars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyLanguageSkills {
	 public static List<String> myLanguages(final Map<String, Integer> results) {
		    
	        // Step 1: Convert the HashMap to a list of entries
	        List<Map.Entry<String, Integer>> list = new ArrayList<>(results.entrySet());

	        // Step 2: Sort the list based on values in descending order
	        list.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
	        List<String> resultList = new ArrayList<String>();
	        for(Entry<String, Integer> list1:list) {
	        	if(list1.getValue()>=60) {
	        		resultList.add(list1.getValue().toString());
	        	}
	        }
		    
		    
		    
		    return resultList;
		  }
	 
	 public static void main(String[] args) {
		 final Map<String, Integer> map1 = new HashMap<>();
		    map1.put("Java", 10);
		    map1.put("Ruby", 80);
		    map1.put("Python", 65);
		 myLanguages(map1);
	 }
}
