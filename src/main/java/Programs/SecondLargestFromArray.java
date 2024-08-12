package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestFromArray {

	public static void main(String[] args)
	{
		int[] arr = {1,5,3,9,2};
		System.out.println("Second Largest element: "+findSecondLargest(arr));
		System.out.println("Second Largest element Using Approach 2 : "+findSecondLargestApproach2(arr));
	}

	private static int findSecondLargestApproach2(int[] arr) {
		// TODO Auto-generated method stub
		List<Integer> arList = new ArrayList<Integer>();
		for(int arr1:arr) {
			arList.add(arr1);
		}
		Collections.sort(arList);
		System.out.println("Second Largest is Using approach 2 = "+arList.get(arList.size()-2));
		return arList.get(arList.size()-2);
	}

	private static int findSecondLargest(int[] arr) {
		// TODO Auto-generated method stub
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		
		for(int ar:arr) {
			if(ar>largest) {
				secondLargest=largest;
				largest = ar;
			}else if(ar>secondLargest && ar!=largest) {
			secondLargest = ar;
			}
		}
		return secondLargest;
	}
}
