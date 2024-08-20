package DataStructure;

public class BubbleSort {

	public static void main(String[] args) {
		int nums[] = {6,5,2,8,9,4};
		int size = nums.length;
		
		System.out.println("before sorting");
		for(int num:nums) {
			System.out.print(num+" ");
		}
		int temp=0;
		//outer loop responsible for iterations
		//inner loop responsible for swapping
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(nums[j]>nums[j+1]) {
					temp = nums[j];
					nums[j]=nums[j+1];
					nums[j+1] = temp;
				}
			}
			System.out.println();
			for(int num:nums) {
				System.out.print(num+ " ");	
			}
		}
		
		System.out.println();
		System.out.println("After sorting");
		for(int num:nums) {
			System.out.print(num+ " ");	
		}
		
	}
}
