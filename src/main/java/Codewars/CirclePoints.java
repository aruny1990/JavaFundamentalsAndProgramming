package Codewars;

public class CirclePoints {

	public static void main(String[] args) 
	{
		int radius = 2;
		System.out.println("Number of integer points: "+countPointsInCircle(radius));
	}
	
    public static int countPointsInCircle(int radius) {
        int count = 0;
        int rSquared = radius * radius;
        
        // Iterate over all possible values of x and y
        for (int x = -radius; x <= radius; x++) {
            for (int y = -radius; y <= radius; y++) {
                // Check if the point (x, y) lies inside or on the circle
                if (x * x + y * y <= rSquared) {
                    count++;
                }
            }
        }
        return count;
    }
}
