package Codewars;

import java.util.ArrayList;
import java.util.List;

public class SplitStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(splitStrings("ab"));
	}

	private static List<String> splitStrings(String s) {
		// TODO Auto-generated method stub
        List<String> result = new ArrayList<>();
        
        int length = s.length();
        for (int i = 0; i < length; i += 2) {
            if (i + 1 < length) {
                result.add(s.substring(i, i + 2));
            } else {
                result.add(s.substring(i, i + 1) + "_");
            }
        }
        
        return result;
		
	}

}
