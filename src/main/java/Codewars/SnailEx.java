package Codewars;

public class SnailEx {
	public static boolean canSnailReachEnd(double x, double y, double z) {
        if (y <= z) {
            return false; // Snail cannot overcome the stretch rate.
        }

        double position = 0.0;
        double length = x;
        double timeLimit = 525600;

        for (int t = 0; t < timeLimit; t++) {
            double previousLength = length;
            length += z;

            // Calculate the snail's progress in this minute
            position += y / previousLength;

            // If the snail has reached or exceeded the total length, return true
            if (position >= 1.0) {
                return true;
            }
        }

        return false; // If after one year the snail has not reached the end, return false
    }

    public static void main(String[] args) {
        System.out.println(canSnailReachEnd(100, 1, 2));       // false
        System.out.println(canSnailReachEnd(100000, 0.1, 0.05)); // false
        System.out.println(canSnailReachEnd(100, 0.5, 1));     // false
        System.out.println(canSnailReachEnd(1000, 1, 2));      // false
        System.out.println(canSnailReachEnd(500, 5, 10));      // false
        System.out.println(canSnailReachEnd(10000, 0.1, 1));   // false
    }
}
