package Codewars;

public class DoubleEveryOther {

	public static void main(String[] args) {
		doubleEveryOther(new int[] {1,2,3,4});
	}

	private static int[] doubleEveryOther(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++){
		      if((i+1)%2==0){
		        a[i]=2*a[i];
		      }
		    }
		    return a;	
	}
}
