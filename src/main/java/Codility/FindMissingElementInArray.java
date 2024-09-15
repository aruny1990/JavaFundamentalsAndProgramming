package Codility;

import java.util.HashMap;

public class FindMissingElementInArray {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the array size: ");
		// int n = sc.nextInt();
		int[] a = { 1, 4, 5, 3, 7, 8, 6 };
		findMissingApproach1(a);
		System.out.println(findMissingApproach2(a));

	}

	private static void findMissingApproach1(int[] a) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		for (int a1 : a) {
			myMap.put(a1, myMap.getOrDefault(a1, 0) + 1);
		}

		//System.out.println(myMap);

		//System.out.println("Length of the array is " + a.length);

		for (int i = 1; i <= a.length + 1; i++) {

			if (!myMap.containsKey(i)) {
				System.out.println("missing number is " + i);
			}

		}

	}
	
	
	private static int findMissingApproach2(int[] a) {
		// TODO Auto-generated method stub
		int n = a.length+1;
		int originalLength = n*(n+1)/2;
		int actualLength = 0;
		
		for(int a1: a) {
			actualLength+=a1;
		}
		
		int missingNumber = originalLength-actualLength;
		
		return missingNumber;

	}
}
