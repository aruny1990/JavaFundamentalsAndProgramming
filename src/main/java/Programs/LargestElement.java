package Programs;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,5,3,9,2};
		System.out.println("Largest element: "+findLargest(arr));
	}

	private static int findLargest(int[] arr) {
		// TODO Auto-generated method stub
		int largest = 0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		return largest;
	}

}
