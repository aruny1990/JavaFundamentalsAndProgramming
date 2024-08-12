package Programs;

public class CarriageReturnLineFeedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Example using \n (Line Feed)
        System.out.println("Example using \\n:");
        System.out.print("Line 1\n");
        System.out.print("Line 2\n");
        System.out.print("Line 3\n");
        
        // Adding a separator for clarity
        System.out.println("--------------------------");

        // Example using \r (Carriage Return)
        System.out.println("Example using \\r:");
        System.out.print("12345");
        System.out.print("\rABCDE\n");  // '\r' moves the cursor to the start, and 'ABCDE' overwrites '12345'

        // Adding a separator for clarity
        System.out.println("--------------------------");

        // Combination of \r and \n
        System.out.println("Combination of \\r and \\n:");
        System.out.print("12345");
        System.out.print("\rABCDE\n");
        System.out.print("Line after newline\n");   
}
	

}
