package Codewars;

import java.util.ArrayList;
import java.util.List;

public class ListFiltering {


	public static void main(String[] args) {
		List myList = new ArrayList<>();

		myList.add(1);
		myList.add(2);
		myList.add("a");
		myList.add("b");
	
		
		//System.out.println(myList);
		
		//System.out.println(".............");
		
		System.out.println(filterList(myList));
	}

	private static List<Integer> filterList(List myList) {
		// TODO Auto-generated method stub
		List result = new ArrayList<>();
		for(Object item: myList) {
			if(item instanceof Integer) {
				result.add(item);
			}
		}
		
		return result;
	}
}
