package Programs;

import java.util.Scanner;

public class Java1DArrayHackerRankProblem {

	public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return isSolvable(leap,game,0); //0 is the position
    }

    private static boolean isSolvable(int leap, int[] game, int i) {
		// TODO Auto-generated method stub
    	if(i>=game.length) {
    		return true;
    	}
    	if(i<0 || game[i] ==1) {
    		return false;
    	}
		game[i]=1;
		
		return isSolvable(leap,game, i+leap)||isSolvable(leap, game, i+1)
				||isSolvable(leap, game, i-1);
	}

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }

}
