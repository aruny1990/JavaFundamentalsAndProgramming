package Codewars;

public class SquareShape {

	public static String generateShape(int n) {
        // Use StringBuilder to efficiently construct the string
        StringBuilder sb = new StringBuilder();

        // Create n rows
        for (int i = 0; i < n; i++) {
            // Add n '+' characters for each row
            for (int j = 0; j < n; j++) {
                sb.append('+');
            }
            // Add a newline character after each row, except the last one
            if (i < n - 1) {
                sb.append('\n');
            }
        }

        // Return the final shape as a string
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(generateShape(3));
        System.out.println();
        System.out.println(generateShape(5));
    }
}
