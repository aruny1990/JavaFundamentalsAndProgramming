package Codewars;

public class ChineseZodiax {
	// Predefined arrays for animals and elements
    private static final String[] ANIMALS = {
        "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake",
        "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"
    };

    private static final String[] ELEMENTS = {
        "Wood", "Fire", "Earth", "Metal", "Water"
    };

    public static void main(String[] args) {
        int year = 1998;  // Example year
        System.out.println(getZodiac(year));  // Output: Earth Tiger
        System.out.println("Wood Snake = "+ getZodiac(1965));
        System.out.println("Earth Tiger ="+ getZodiac(1938));
        System.out.println("Earth Tiger = "+ getZodiac(1998));
        System.out.println("Fire Monkey = "+getZodiac(2016));
        System.out.println("Wood Rat = "+ getZodiac(1924));
        System.out.println("Earth Monkey = "+ getZodiac(1968));
        System.out.println("Water Dog = "+ getZodiac(2162));

    }

    public static String getZodiac(int year) {
        // Start year of the current cycle
        int startYear = 1984;
        int cycleLength = 60;
        int adjustedStartYear = 1924;

        // Calculate the year offset within the 60-year cycle
        int offset = (year - adjustedStartYear) % cycleLength;
        if (offset < 0) {
            offset += cycleLength;  // Handle negative offsets for years before the start year
        }
        

        // Calculate the year offset within the 60-year cycle
      //  int offset = (year - startYear) % cycleLength;

        // Determine the animal index
        int animalIndex = offset % ANIMALS.length;

        // Determine the element index
        int elementIndex = (offset / 2) % ELEMENTS.length;

        // Return the element and animal for the given year
        return ELEMENTS[elementIndex] + " " + ANIMALS[animalIndex];
    }
}
