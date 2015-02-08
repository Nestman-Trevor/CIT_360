package javaCollections;

import java.util.HashMap;
import java.util.Map;

/************************************************************
 * 
 * @author  Sotirios-Efstathios Maneas
 * Found at: http://examples.javacodegeeks.com/java-basics/java-map-example/
 ************************************************************/

public class InternetCollectionMap {

	public static void main(String[] args) {
		Map vehicles = new HashMap();
		
		//Add some vehicles.
		vehicles.put("BMW", 5);
		vehicles.put("Mercedes", 3);
		vehicles.put("Audi", 4);
		vehicles.put("Ford", 10);
		
		System.out.println("Total vehicles: " + vehicles.size());
		
		//Iterate over all vehicles, using the keySet method.
		for (String key: vehicles.keySet())
			System.out.println(key + " - " + vehicles.get(key));
		System.out.println();
		
		String searchKey = "Audi";
		if (vehicles.containsKey(searchKey))
			System.out.println("Found total " + vehicles.get(searchKey) + " "
					+ searchKey + " cars!\n");
		
		//Clear all values.
		vehicles.clear();
		
		//Equals to zero
		System.out.println("After clear operation, size: " + vehicles.size());
	}

	
}
