package Programs;

import java.util.Scanner;

public class EscapeCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("\u2028");
System.out.println("\u2029");
System.out.println("Without Carriage return example"+"new sentence");
System.out.println();
System.out.print("Carriage return example \r After doing carriage return");
System.out.println();
System.out.println("Using new line esc character example"+"\n"+"After doing back slash n return");
System.out.println();

// Example using \n (Line Feed)
System.out.println("Line 1\nLine 2\nLine 3");

// Example using \r (Carriage Return)
System.out.println("Carriage return example:");
System.out.print("12345\r");
System.out.println("ABCDE");

// Combination of \r and \n
System.out.println("Combination of \\r and \\n:");
System.out.print("12345\rABCDE\nLine after newline\n");

System.out.println("The below are:");
System.out.println("\u0085");

System.out.println("Last: ");
System.out.println("\r|[\n");



	}

}
