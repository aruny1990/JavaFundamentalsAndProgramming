package Codewars;

import java.util.ArrayList;
import java.util.List;

public class RangeExtrationExample {
	public static void main(String[] args) {
		// Test case
		int[] numbers = { -10,-9,-8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20 };
		System.out.println(rangeExtraction(numbers)); // Output: "-10--8,-6,-3-1,3-5,7-11,14,15,17-20"
	}

	private static String rangeExtraction(int[] numbers) {
		// TODO Auto-generated method stub
		List<String> myList = new ArrayList<>();
		int start = numbers[0];
		int end = numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]==end+1) {
				end = numbers[i];
			}else {
				rangeAdd(myList,start,end);
				start = numbers[i];
				end = numbers[i];
			}
		}
		rangeAdd(myList,start,end);
		
		return String.join(",", myList);
	}

	private static void rangeAdd(List<String> myList, int start, int end) {
		// TODO Auto-generated method stub
		if(end-start>=2) {
			myList.add(start+"-"+end);
		}else if(end>start) {
			myList.add(start+","+end);
		}else {
			myList.add(String.valueOf(start));
		}
		
	}
}
