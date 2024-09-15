package Codewars;

public class PerfectSquare {

	public static long findNextSquare(long sq) {
        // Calculate the square root of the input number
        long sqrt = (long) Math.sqrt(sq);
        
        // Check if the input is a perfect square
        if (sqrt * sqrt == sq) {
            // Return the next perfect square
            return (sqrt + 1) * (sqrt + 1);
        }
        
        // If not a perfect square, return -1
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findNextSquare(121)); // Output: 144
        System.out.println(findNextSquare(625)); // Output: 676
        System.out.println(findNextSquare(114)); // Output: -1
    }
}
