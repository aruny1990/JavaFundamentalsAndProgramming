package Codewars;

public class EmailObfuscator {

	public static String obfuscate(String email) {

		String obfuscateEmail = email.replace("@", " [at] ");

		obfuscateEmail = obfuscateEmail.replace(".", " [dot] ");

		return obfuscateEmail;

	}

	public static void main(String[] args) {
		// Test cases
		System.out.println(obfuscate("user_name@example.com")); // Output: "user_name [at] example [dot] com"
		System.out.println(obfuscate("af5134@borchmore.edu")); // Output: "af5134 [at] borchmore [dot] edu"
		System.out.println(obfuscate("jim.kuback@ennerman-hatano.com")); // Output: "jim [dot] kuback [at]
																			// ennerman-hatano [dot] com"
	}
}
