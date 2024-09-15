package Codewars;

public class PopulationGrowth {

	public static int nbYear(int p0, double percent, int aug, int p) {
		int years = 0;
		int population = p0;

		// While population is less than the target
		while (population < p) {
			// Update population for the year
			population += (int) (population * (percent / 100)) + aug;
			years++; // Increment the year counter
		}

		return years;
	}

	public static void main(String[] args) {
		// Example test cases
		System.out.println(nbYear(1500, 5, 100, 5000)); // Output: 15
		System.out.println(nbYear(1500000, 2.5, 10000, 2000000)); // Output: 10
		System.out.println(nbYear(1000, 2, 50, 1200)); // Output: 3
	}
}
