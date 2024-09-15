package Codewars;

public class CannonBallPyramid {
	public static double stackHeight3d(int layers) {
        // If there are no layers, height is 0
        if (layers == 0) {
            return 0.0;
        }
        
        // The height contributed by each layer
        double height = 0.0;
        
        // Loop through each layer to calculate the total height
        for (int i = 1; i <= layers; i++) {
            height += Math.sqrt(1 - 1 / 4.0); // Height contribution per layer
        }
        
        // Return the total height
        return height;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(stackHeight3d(3));  // Output: 2.598
        System.out.println(stackHeight3d(4));  // Output: 3.464
        System.out.println(stackHeight3d(5));  // Output: 4.330
    }

}
