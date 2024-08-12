package Programs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HsshSetUniquePairsProgramHackerRank {
	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    String [] pair_left = new String[t];
    String [] pair_right = new String[t];
    
    Set<String> uniquePairs = new HashSet<String>();
    for (int i = 0; i < t; i++) {
        pair_left[i] = s.next();
        pair_right[i] = s.next();
        s.nextLine();//consume the new line character
        
        String pair = pair_left[i]+" "+pair_right[i];
        
        uniquePairs.add(pair);
        
        System.out.println(uniquePairs.size());
    }
  }
}
