package Programs;

public class CheckForPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "radar";
		System.out.println("Is palindrome: "+palindrome(str));
	}

	private static boolean palindrome(String str) {
		// TODO Auto-generated method stub
		String rev = "";
		boolean palind = false;
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		if(rev.equals(str)) {
			palind = true;
		}
		return palind;
	}

}
