package datastructure;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList<String> fruitsName = new ArrayList<>();
		// Add elements
		fruitsName.add("apple");
		fruitsName.add("mango");
		fruitsName.add("pear");
		fruitsName.add("fig");
		fruitsName.add("water melon");
		fruitsName.add("kiwi");
		fruitsName.add("banana");

		// Print all elements
		System.out.println(fruitsName);

		// Access one element
		System.out.println(fruitsName.get(2));

		// Add one element
		fruitsName.add("orange");
		System.out.println("After adding orange" +fruitsName);

		// Remove element
		fruitsName.remove("mango");
		System.out.println("After Remove "+fruitsName);

		// Print all elements
		System.out.println("************************* using for each loop ****************");
		for(String fruit : fruitsName){
			System.out.println(fruit);
		}

		System.out.println("************************* using iterator ****************");
		// Print all elements using iterator
		Iterator<String> it = fruitsName.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		// Sort elements using Collections
		System.out.println("************************* After Sorting ****************");
		Collections.sort(fruitsName);
		Iterator<String> it2 = fruitsName.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}



	}

}




