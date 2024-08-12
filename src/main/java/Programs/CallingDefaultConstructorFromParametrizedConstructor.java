package Programs;

public class CallingDefaultConstructorFromParametrizedConstructor {

	private String name;
    private int age;

    // Default constructor
    CallingDefaultConstructorFromParametrizedConstructor() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    CallingDefaultConstructorFromParametrizedConstructor(String name, int age) {
        // Calling default constructor using this()
        this();  // Calls Person() constructor

        this.name = name;
        this.age = age;
    }

    // Method to display details of the person
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
    	//CallingDefaultConstructorFromParametrizedConstructor person1 = new CallingDefaultConstructorFromParametrizedConstructor();           // Calls default constructor
    	CallingDefaultConstructorFromParametrizedConstructor person2 = new CallingDefaultConstructorFromParametrizedConstructor("Alice",29);   // Calls parameterized constructor
    	//CallingDefaultConstructorFromParametrizedConstructor person3 = new CallingDefaultConstructorFromParametrizedConstructor("Bob", 30); // Calls parameterized constructor

        // Displaying details
       // person1.display(); // Output: Name: Unknown, Age: 0
        person2.display(); // Output: Name: Alice, Age: 0
        //person3.display(); // Output: Name: Bob, Age: 30
    }
}

//Constructor Chaining: The line this(); inside the parameterized constructor calls the default constructor. This ensures that the default initialization logic (name = "Unknown" and age = 0) is applied before setting the values from the parameters.
//
//Benefits of Constructor Chaining:
//Code Reusability: Allows reusing initialization logic across different constructors.
//
//Initialization Flexibility: Provides flexibility in initializing objects by allowing different constructors to handle different initialization scenarios.