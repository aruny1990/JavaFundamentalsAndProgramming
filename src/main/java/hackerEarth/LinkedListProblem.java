package hackerEarth;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> l1 = new LinkedList();
		l1.add("Alice");
		l1.add("Mary");
		LinkedList<String> l2 = new LinkedList();
		l2.add("Bob");
		l2.add("Mike");
		l2.addAll(0, l1);
		l2.add("Bob");
		
		Iterator<String> iterator = l2.descendingIterator();
		
		// Iterate through the list in reverse order
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
		
	}

}
