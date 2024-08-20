package DataStructure;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {6,5,2,8,9,4};
		int size = nums.length;
		int minIndex=-1;
		int temp=0;
		System.out.println("before sorting");
		for(int num:nums) {
			System.out.print(num+" ");
		}
		
		for(int i=0;i<size-1;i++) {
			minIndex=i;
			for(int j=i;j<size;j++) {
				if(nums[minIndex]>nums[j]) {
					minIndex=j;
				}
			}
			//swapping logic
			temp=nums[minIndex];
			nums[minIndex]=nums[i];
			nums[i]=temp;
		}
		
		System.out.println();
		System.out.println("After sorting");
		for(int num:nums) {
			System.out.print(num+ " ");	
		}
	}

}
