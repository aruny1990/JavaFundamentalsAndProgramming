package Programs;
import java.util.*;


/*Checker Class:

This class implements the Comparator interface for the Player class.
The compare method first checks if the scores of the two players are equal. If they are, it compares the names alphabetically using String's compareTo method.
If the scores are not equal, it sorts by score in descending order by subtracting a.score from b.score.
*/

//Write your Checker class here
//Checker class implementing Comparator
class Checker implements Comparator<Player> {
 @Override
 public int compare(Player a, Player b) {
     if (a.score == b.score) {
         return a.name.compareTo(b.name);
     } else {
         return b.score - a.score;
     }
 }
}
	class Player{
	    String name;
	    int score;
	    
	    Player(String name, int score){
	        this.name = name;
	        this.score = score;
	    }
	}

	
public class JavaComparatorProgramHackerRank {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();

	        Player[] player = new Player[n];
	        Checker checker = new Checker();
	        
	        for(int i = 0; i < n; i++){
	            player[i] = new Player(scan.next(), scan.nextInt());
	        }
	        scan.close();
	     
	        Arrays.sort(player, checker);
	        for(int i = 0; i < player.length; i++){
	            System.out.printf("%s %s\n", player[i].name, player[i].score);
	        }
	    
	}
}
