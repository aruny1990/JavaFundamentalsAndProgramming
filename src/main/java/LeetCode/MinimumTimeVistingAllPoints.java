package LeetCode;

public class MinimumTimeVistingAllPoints {
	public static int minTimeToVisitAllPoints(int[][] points) {
		int totalTime = 0;

		for (int i = 1; i < points.length; i++) {
			int x1 = points[i - 1][0];
			int y1 = points[i - 1][1];
			int x2 = points[i][0];
			int y2 = points[i][1];

			int deltaX = Math.abs(x2 - x1);
			int deltaY = Math.abs(y2 - y1);

			// The time to move from (x1, y1) to (x2, y2) is max(deltaX, deltaY)
			totalTime += Math.max(deltaX, deltaY);
		}

		return totalTime;
	}

	public static void main(String[] args) {
		// MinimumTimeVisitingAllPoints solver = new MinimumTimeVisitingAllPoints();

		// Example 1
		int[][] points1 = { { 1, 1 }, { 3, 4 }, { -1, 0 } };
		System.out.println(minTimeToVisitAllPoints(points1)); // Output: 7

		// Example 2
		int[][] points2 = { { 3, 2 }, { -2, 2 } };
		System.out.println(minTimeToVisitAllPoints(points2)); // Output: 5
	}
}
