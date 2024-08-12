package Programs;

import java.util.Scanner;

public class ScannerSkipExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String input = "123, abc, 456";
        Scanner scanner = new Scanner(input);
        
        // Read the first number
        if (scanner.hasNextInt()) {
            System.out.println("First number: " + scanner.nextInt());
        }
        
        // Skip the comma and whitespace
        if (scanner.hasNext(",\\s*")) {
            scanner.skip(",\\s*");
        }
        
        // Read the word
        if (scanner.hasNext()) {
            System.out.println("Word: " + scanner.next());
        }
        
        // Skip the comma and whitespace
        if (scanner.hasNext(",\\s*")) {
            scanner.skip(",\\s*");
        }
        
        // Read the second number
        if (scanner.hasNextInt()) {
            System.out.println("Second number: " + scanner.nextInt());
        }
        
        scanner.close();

	}

}
