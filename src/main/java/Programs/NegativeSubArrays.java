package Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NegativeSubArrays {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		//Read the size of array
		int n = Integer.parseInt(bufferedReader.readLine().trim());
		
		System.out.println("\r n is = "+n);
		
		//Read the elements of the array
		String[] inputArray = bufferedReader.readLine().trim().split("\\s+");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(inputArray[i]);
		}
		
		//below is logic to get total negative numbers subarray sum
		int count=0;
		for (int start=0;start<n;start++) {
			int sum=0;
			for(int end=start;end<n;end++) {
				sum+=arr[end];
				if(sum<0) {
					count++;
				}
			}
		}
		
		System.out.println("count is = "+count);
		
		
		/*
		 * Reading Input:
		 * 
		 * We use BufferedReader to read input efficiently. The first line gives us the
		 * size of the array n. The second line contains the space-separated integers
		 * which are parsed into an array arr.
		 */
		
		
	}

}
