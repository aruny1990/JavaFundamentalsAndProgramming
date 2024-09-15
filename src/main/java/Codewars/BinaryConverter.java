package Codewars;

import java.util.List;

public class BinaryConverter {

	public static int binaryArrayToInt(List<Integer> binary) {
        // Convert the list of integers (0s and 1s) to a binary string
        StringBuilder binaryString = new StringBuilder();
        for (int bit : binary) {
            binaryString.append(bit);
        }

        // Convert the binary string to an integer
        return Integer.parseInt(binaryString.toString(), 2);
    }

    public static void main(String[] args) {
        System.out.println(binaryArrayToInt(List.of(0, 0, 0, 1)));  // Output: 1
        System.out.println(binaryArrayToInt(List.of(0, 0, 1, 0)));  // Output: 2
        System.out.println(binaryArrayToInt(List.of(0, 1, 0, 1)));  // Output: 5
        System.out.println(binaryArrayToInt(List.of(1, 0, 0, 1)));  // Output: 9
        System.out.println(binaryArrayToInt(List.of(1, 1, 1, 1)));  // Output: 15
        System.out.println(binaryArrayToInt(List.of(1, 0, 1, 1)));  // Output: 11
    }
}

/*
 * The List.of() method in Java is a static factory method introduced in Java 9. It is used to create immutable lists. This method allows you to quickly and concisely create a list of elements, without needing to use the more verbose ArrayList constructor or Arrays.asList().

Key Features of List.of():
Immutable: The list created by List.of() is unmodifiable, meaning you cannot add, remove, or change elements in the list after it is created. Any attempt to modify it will result in an UnsupportedOperationException.

Compact and Convenient: It's a shorter and cleaner way to create lists compared to previous methods.

Null Handling: List.of() does not allow null values. If you try to pass null as one of the elements, it will throw a NullPointerException.

Syntax:
java
Copy code
List<E> list = List.of(element1, element2, element3, ...);
It can take zero or more elements and returns a list containing those elements in the same order.
Example Usage:
Creating a List with Elements:

java
Copy code
List<String> list = List.of("Apple", "Banana", "Cherry");
System.out.println(list); // Output: [Apple, Banana, Cherry]
Creating an Empty List:

java
Copy code
List<String> emptyList = List.of();
System.out.println(emptyList); // Output: []
Handling Unmodifiable Nature:

java
Copy code
List<String> fruits = List.of("Apple", "Banana", "Cherry");
fruits.add("Orange"); // This will throw UnsupportedOperationException
No Null Elements Allowed:

java
Copy code
List<String> listWithNull = List.of("Apple", null); // Throws NullPointerException
Comparison with Arrays.asList():
Before Java 9, you might have used Arrays.asList() to create lists, but there are some differences:

Mutability:

Arrays.asList() creates a mutable list backed by an array, but it has a fixed size.
List.of() creates an immutable list.

 * 
 * */
