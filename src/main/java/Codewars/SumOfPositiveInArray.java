package Codewars;

public class SumOfPositiveInArray {
public static void main(String[] args) {
	int [] arr = new int[] {1,-4,7,12};
	int sum = sumPositiveInArray(arr);
	System.out.println(sum);
}

public static int sumPositiveInArray(int[] arr) {
	// TODO Auto-generated method stub
	int sum=0;
	for(int num:arr) {
		if(num>=0) {
			sum +=num;
		}
	}
	return sum;
}
}
