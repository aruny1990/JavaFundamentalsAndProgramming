package hackerEarth;

import java.util.Scanner;

public class ZooChecker {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input word
        String word = scanner.nextLine();
        
        // Count the number of Zs and Os
        int countZ = 0;
        int countO = 0;
        
        for (char c : word.toCharArray()) {
            if (c == 'Z' || c == 'z') {
                countZ++;
            } else if (c == 'O' || c == 'o') {
                countO++;
            }
        }

        // Check if the number of Os is exactly twice the number of Zs
        if (countO == 2 * countZ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
