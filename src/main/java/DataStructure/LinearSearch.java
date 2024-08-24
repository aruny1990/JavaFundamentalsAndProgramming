package DataStructure;

public class LinearSearch {

	// Method to perform linear search
    public static int linearSearch(int[] arr, int target) {
        // Traverse through the array
    	int steps = 0;
        for (int i = 0; i < arr.length; i++) {
        	steps++;
            // Check if the current element is equal to the target
            if (arr[i] == target) {
            	System.out.println("Steps taken in linear search is "+steps);
                return i; // Return the index of the target element
            }
        }
        // If the element is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {1,2,3,6,7,9,10,11,13};

        // Target element to search for
        int target = 13;

        // Call linearSearch method
        int result = linearSearch(arr, target);

        // Print the result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
