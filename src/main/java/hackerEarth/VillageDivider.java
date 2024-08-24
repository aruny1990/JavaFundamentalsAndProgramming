package hackerEarth;

import java.util.Scanner;

public class VillageDivider {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);

     // Read the number of grids
     int n = scanner.nextInt();
     scanner.nextLine();  // Consume the newline character

     // Read the village representation
     String village = scanner.nextLine();

     // Initialize the result as a character array of the same length as the village
     char[] result = village.toCharArray();

     // We will add fences between segments of houses
     for (int i = 1; i < n - 1; i++) {
         if (result[i] == '.' && result[i - 1] == 'H' && result[i + 1] == 'H') {
             result[i] = 'B';  // Place a fence to separate two houses
         }
     }

     // Place fences around the houses to maximize them
     for (int i = 0; i < n; i++) {
         if (result[i] == '.') {
             result[i] = 'B';
         }
     }

     // Check if the solution is valid
     boolean valid = true;
     for (int i = 0; i < n - 1; i++) {
         if (result[i] == 'H' && result[i + 1] == 'H') {
             valid = false;
             break;
         }
     }

     if (valid) {
         System.out.println("YES");
         System.out.println(new String(result));
     } else {
         System.out.println("NO");
     }

     scanner.close();
	}
}
