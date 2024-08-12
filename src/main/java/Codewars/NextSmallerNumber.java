package Codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NextSmallerNumber {

	public static void main(String[] args) {
		System.out.println(nextSmaller(907));
	}
	
	public static int nextSmaller(int n) {
        List<Integer> digits = new ArrayList<>();
        while (n > 0) {
            digits.add(n % 10);//709
            n /= 10;
        }
        Collections.reverse(digits);//907

        int len = digits.size();
        int pivot = -1;

        // Step 1: Find the pivot point we are starting 
        //from the last as we need to find the largest smallest number
        //we will compare if rightmost digit is greater than the its left element
        //For eg. 2071 - Here we will compare if 7>1 if yes then we need to consider 7th element 
        //index as pivot point
        for (int i = len - 2; i >= 0; i--) {
            if (digits.get(i) > digits.get(i + 1)) {
                pivot = i;
                break;
            }
        }

        // If no pivot found, return -1
        if (pivot == -1) {
            return -1;
        }

        // Step 2: Find the largest digit smaller than the pivot
        //2071 - 1<7 so swap index is 3 and pivot is 2
        int swapIndex = -1;
        for (int i = len - 1; i > pivot; i--) {
            if (digits.get(i) < digits.get(pivot)) {
                swapIndex = i;
                break;
            }
        }

        // Step 3: Swap the pivot with the found digit
        Collections.swap(digits, pivot, swapIndex);

        // Step 4: Reverse the digits after the pivot
          List<Integer> sublist = digits.subList(pivot + 1, len);
          sublist.sort(Collections.reverseOrder());

        // Convert back to integer
        long result = 0;
        for (int digit : digits) {
            result = result * 10 + digit;
        }

        // Check if result is within integer range and does not start with zero
        if (result > Integer.MAX_VALUE || String.valueOf(result).length() != digits.size()) {
            return -1;
        }

        return (int) result;	 
	}
}
