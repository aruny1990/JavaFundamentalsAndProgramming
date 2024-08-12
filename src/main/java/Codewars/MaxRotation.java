package Codewars;

public class MaxRotation {

	public static void main(String[] args) {
		System.out.println(maxRot(56789)); // 68957
	}
    public static long maxRot(long n) {
        String numStr = Long.toString(n);
        long max = n;
        for(int i=0;i<numStr.length()-1;i++) {
        	numStr = numStr.substring(0,i)+rotateLeft(numStr.substring(i));
        }
        long num = Long.parseLong(numStr);
        if(num>max) {
        	max = num;
        }
        return max;
        
    }
	public static String rotateLeft(String str) {
		// TODO Auto-generated method stub
		if(str.length()<=1) {
			return str;
		}
		return str.substring(1)+str.charAt(0);
	}
}
