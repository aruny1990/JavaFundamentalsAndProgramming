package Codewars;

public class ArithematicProgression {
public static void main(String[] args) {
	//System.out.println(findMissingTerm(new int[] {4,3,1}));
	int[] arr2 = {38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38};
    System.out.println("Missing term is: " + findMissingTerm(arr2));

}

private static int findMissingTerm(int[] arr) {
	// TODO Auto-generated method stub
	int length = arr.length;
	int max = arr[arr.length-1];
	int min = arr[0];
	int d = (max-min)/length;
	int missing =0;
	
	if(d==0) {
		return arr[0];
	}
	for(int i=0;i<=arr.length-1;i++) {
		 // If the next element is not as expected in AP, we found the missing term
        if (arr[i] + d != arr[i + 1]) {
            return arr[i] + d;
        }
	}
	return -1;
}
}
