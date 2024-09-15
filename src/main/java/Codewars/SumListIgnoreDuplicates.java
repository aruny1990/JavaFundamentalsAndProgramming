package Codewars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SumListIgnoreDuplicates {

	
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(3);
		myList.add(4);
		myList.add(3);
		myList.add(6);
		
		System.out.println(myList);
		System.out.println("Sum of the numbers igonring duplicates: "+sumIgnoringDuplicates(myList));
	}

	private static Integer sumIgnoringDuplicates(List<Integer> myList) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> myMap = new HashMap();
		Integer sum = 0;
		for(Integer list:myList) {
			myMap.put(list, myMap.getOrDefault(list, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> map: myMap.entrySet()) {
			if(!(myMap.get(map.getKey())>1)) {
				sum+=map.getKey();
			}
		}
 		return sum;
	}
}
