package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Queue<String> veggies = new LinkedList<>();

		// Add elements
		veggies.add("carrot");
		veggies.add("lettuce");
		veggies.add("potato");
		veggies.add("tomato");
		veggies.add("garlic");
		veggies.add("ginger");
		veggies.add("avocado");
		System.out.println(veggies);

		// Peak first element
		System.out.println("Peek first element " + veggies.peek());

		// Print first element
		System.out.println("Print first element " + veggies.element());

		// Remove one element
		System.out.println("Remove tomato " + veggies.remove("tomato"));

		// Poll (peak and remove)
		veggies.poll();
		System.out.println("After first poll" + veggies);

		// Check if it contains garlic
		System.out.println("Check if it queue contains garlic : " + veggies.contains("garlic"));

		System.out.println(" print elements after second poll using for each loop ");
		// Poll again and print all element with for each
		veggies.poll();
		for (String veggie : veggies) {
			System.out.println(veggie);
		}
		System.out.println(" print elements after second poll using iterator ");
		Iterator<String> it = veggies.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}