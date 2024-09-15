package Codewars;

import java.util.HashMap;
import java.util.Map;

public class BoredomAssesment {
	// Create a map to store the boredom score for each department
	private static final Map<String, Integer> departmentBoredomMap = new HashMap<>();

	static {
		departmentBoredomMap.put("accounts", 1);
		departmentBoredomMap.put("finance", 2);
		departmentBoredomMap.put("canteen", 10);
		departmentBoredomMap.put("regulation", 3);
		departmentBoredomMap.put("trading", 6);
		departmentBoredomMap.put("change", 6);
		departmentBoredomMap.put("IS", 8);
		departmentBoredomMap.put("retail", 5);
		departmentBoredomMap.put("cleaning", 4);
		departmentBoredomMap.put("pissing about", 25);
	}

	// Method to calculate the total boredom score and return the appropriate
	// sentiment
	public static String assessTeamBoredom(Person[] team) {
		int totalScore = 0;

		// Calculate total boredom score
		for (Person person : team) {
			totalScore += departmentBoredomMap.getOrDefault(person.department, 0);
		}

		// Return appropriate sentiment based on the total score
		if (totalScore <= 80) {
			return "kill me now";
		} else if (totalScore < 100) {
			return "i can handle this";
		} else {
			return "party time!!";
		}
	}

	public static void main(String[] args) {
		// Example team
		Person[] team = { new Person("Alice", "accounts"), new Person("Bob", "trading"),
				new Person("Charlie", "canteen"), new Person("Daisy", "cleaning") };

		// Assess the team's boredom score
		String result = assessTeamBoredom(team);
		System.out.println(result); // Output depends on the provided team
	}
}

// Class representing a person
class Person {
	public final String name;
	public final String department;

	public Person(String name, String department) {
		this.name = name;
		this.department = department;
	}
}
