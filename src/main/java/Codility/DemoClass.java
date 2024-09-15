package Codility;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String myStr = "arun yadav"; //output - Arun Yadav
		System.out.println(formattedString(myStr));
	}

	private static String formattedString(String myStr) {
		// TODO Auto-generated method stub
		
		String[] mySplitString = myStr.split(" ");
		StringBuffer sb = new StringBuffer();
		
		for(String str1: mySplitString) {
			sb = sb.append(Character.toUpperCase(str1.charAt(0)));
			for(int i=1; i<str1.length();i++) {
				sb.append(str1.charAt(i));
			}
			sb.append(" ");
		}
		
		return sb.toString();
	}

}
