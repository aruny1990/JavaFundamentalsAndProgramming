package Codewars;

public class Generators {

	private final int a; // The constant multiplier
	private int num = 0; // The counter, starts at 0

	// Private constructor to initialize the multiplier
	private Generators(int a) {
		this.a = a;
	}

	// Static factory method to create a Generator instance
	public static Generators of(int a) {
		return new Generators(a);
	}

	// Method to generate the next multiplication string
	public String next() {
		num++; // Increment num by 1 each time next() is called
		int result = a * num; // Calculate the multiplication result
		return a + " x " + num + " = " + result; // Return the string in the required format
	}

	public static void main(String[] args) {
		Generators gen = Generators.of(5); // Use the static factory method to create an instance
		System.out.println(gen.next()); // 5 x 1 = 5
		System.out.println(gen.next()); // 5 x 2 = 10
	}
}


//Static Factory Method
//We cannot create object outside the class if we make constructor as private
