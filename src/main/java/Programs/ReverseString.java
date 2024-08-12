package Programs;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Andela";
		//String rev = reverse(str);
		String rev = reverse1(str);
		System.out.println(rev);
	}

	private static String reverse1(String str) {
		// TODO Auto-generated method stub
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		return rev;
	}

	private static String reverse(String str) {
		// TODO Auto-generated method stub
		StringBuilder reversed = new StringBuilder(str);
		return reversed.reverse().toString();
	}

	//Approach 2
	
}
