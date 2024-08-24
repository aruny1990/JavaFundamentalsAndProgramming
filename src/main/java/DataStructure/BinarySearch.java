package DataStructure;

public class BinarySearch {

	
	public static void main(String[] args) {
        // Example sorted array
        int[] arr = {1,2,3,6,7,9,10,11,13};

        // Target element to search for
        int target = 13;

        // Call binary search method
        int result = binarySearchIterative(arr, target);

        
        // Print the result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
	}

	public static int binarySearchIterative(int[] nums, int target) {
		// TODO Auto-generated method stub
		int left =0;
		int right = nums.length-1;
		int steps=0;
		
		while(left<=right) {
			steps++;
			int mid = (left+right)/2;
			
			
			if(nums[mid] == target) {
				System.out.println("Steps taken in binary is "+steps);
				return mid;
			}
			
			 // If target is greater, ignore the left half
			if(nums[mid]<target) {
				left = mid+1;
			}
			
			// If target is smaller, ignore the right half
			else {
				right = mid-1;
			}
		}
		return -1;
	}
}
