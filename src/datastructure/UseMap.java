package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		Map<Integer, String> worldCup = new HashMap<>();
		worldCup.put(1998, "France");
		worldCup.put(2002, "Brazil");
		worldCup.put(2006, "Italy");
		worldCup.put(2010, "Spain");
		worldCup.put(2014, "Germany");
		worldCup.put(2018, "France");

		System.out.println(worldCup);

		// Remove one element
		worldCup.remove(2014);
		System.out.println("After remove" + worldCup);

		// Add one element using put
		worldCup.put(2018, "France");
		System.out.println("After add" + worldCup);

		System.out.println(" print all elements before sorting (first approach) ");
		// 1st approach
		for (Map.Entry<Integer, String> mp : worldCup.entrySet()) {
			System.out.println(mp.getKey() + " : " + mp.getValue());
		}
		System.out.println(" second approach ");
		// 2nd approach
		for (Integer in : worldCup.keySet()) {
			System.out.println(in + " : " + worldCup.get(in));
		}
		System.out.println("* print all elements after key sorting by descending order ");
		// Sort using Tree Map in descending order
		TreeMap<Integer, String> sorted = new TreeMap<>();
		sorted.putAll(worldCup);

		for (Map.Entry<Integer, String> mp : worldCup.entrySet()) {
			System.out.println(mp.getKey() + " : " + mp.getValue());
		}

		System.out.println(" List/HashMap ");
		List<String> teamSpain = new LinkedList<>();
		teamSpain.add("real madrid");
		teamSpain.add("barcelona");
		teamSpain.add("atletico madrid");
		teamSpain.add("fc sevilla");
		teamSpain.add("valencia");
		teamSpain.add("villareal");
		teamSpain.add("atletic bilbao");
		teamSpain.add("real sociedad");

		List<String> teamEngland = new LinkedList<>();
		teamEngland.add("liverpool");
		teamEngland.add("man united");
		teamEngland.add("man city");
		teamEngland.add("chelsea");
		teamEngland.add("tottenham");
		teamEngland.add("arsenal");
		teamEngland.add("leicester");
		teamEngland.add("everton");

		List<String> teamItaly = new LinkedList<>();
		teamItaly.add("juventus");
		teamItaly.add("inter milan");
		teamItaly.add("ac milan");
		teamItaly.add("as napoli");
		teamItaly.add("as roma");
		teamItaly.add("lazio roma");
		teamItaly.add("atalanta");

		HashMap<String, List<String>> map = new HashMap<>();
		map.put("Spain", teamSpain);
		map.put("England", teamEngland);
		map.put("Italy", teamItaly);
		// Print all values
		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		// Insert data in MySql from ArrayList
		/*ConnectToSqlDB connect = new ConnectToSqlDB();
		connect.insertDataFromArrayListToSqlTable(teamEngland, "England", "Team");
		connect.insertDataFromArrayListToSqlTable(teamSpain, "Spain", "Team");
		connect.insertDataFromArrayListToSqlTable(teamItaly, "Italy", "Team");

		// Retrieve data from MySql from ArrayList
		connect.readDataBase("England", "Team");
		connect.readDataBase("Spain", "Team");
		connect.readDataBase("Italy", "Team");

		// Insert data in MySql from Map
		ConnectToSqlDB.insertDataFromHashMapToSqlTable(map, "country", "soccerTeams");
*/
	}
}



