package datastructure;

import databases.ConnectToSqlDB;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
// Read the text file:
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		String data = "";

		String filePath = "src/data/self-driving-car";
		try {
			fileReader = new FileReader(filePath);
			bufferedReader = new BufferedReader(fileReader);
			while ((data = bufferedReader.readLine()) != null) {
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found Exception");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
				bufferedReader.close();
			} catch (Exception e) {
				System.out.println("File already closed");
			}
		}


		System.out.println(" --------------------using Linked List--------------------- ");

		// Store the text in LinkedList
		Scanner sc1 = new Scanner(new File("src/data/self-driving-car"));
		LinkedList<String> list = new LinkedList<>();
		while (sc1.hasNextLine()) {
			String line = sc1.nextLine();
			String[] words = line.split(" ");
			for (String word : words) {
				list.add(word);
			}
		}
		// Retrieve data using FIFO
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// Store LinkedList data in MySql
		//ConnectToSqlDB.insertDataFromArrayListToSqlTable(list, "store_text_Linked_list", "self-driving-car");


		System.out.println(" ------------------using stack----------------- ");

		// Store the text in stack
		Scanner sc2 = new Scanner(new File("src/data/self-driving-car"));
		Stack<String> stk = new Stack<>();
		while (sc2.hasNextLine()) {
			String line1 = sc2.nextLine();
			String[] words = line1.split(" ");
			for (String word : words) {
				stk.push(word);
			}
		}
		// Using for each
		for (String str : stk) {
			System.out.println(str);
		}
		// Using iterator
		Iterator<String> iterate = stk.iterator();
		while (iterate.hasNext()) {
			System.out.println(iterator.next());
		}
		// Push one more element
		stk.push("pushed-element");
		System.out.println(stk);
		// Pop one element
		stk.pop();
		System.out.println(stk);

		//ConnectToSqlDB.insertDataFromArrayListToSqlTable(stk, "store-text-stack", "self-driving-car");
	}
}






