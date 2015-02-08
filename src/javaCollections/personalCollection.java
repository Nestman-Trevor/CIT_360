package javaCollections;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
 * a lot like an array
 * unlike an array it's dynamic
 * a list you don't need a specific size, it changes by itself
 * 
 * set is a list, no duplicates
 * list can have duplicate items.
 */
public class personalCollection {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public class Month{
		//Set<Day> month = new Set<Day>();
	}
	
	static class Day{
		
		String day;
		int total;
		List<String> water = new ArrayList<String>();
		
		public Day(){
			day = "Sunday";
			total = 0;
			setDay();
		}
		public void setDay(){
			System.out.print("Enter the day (Example \"Monday\"): ");
			try {
				day = reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void drankWater(){
			int newDranked = 0;
			//System.out.print("Enter amount drank: ");
			//newDranked = getIntFromUser();				Normally from user, using random
			newDranked = randomInt(0, 20);
			addToWater(newDranked);
		}
		private void addToWater(int amount){
			water.add(Integer.toString(amount));			//Use List.add here
			total = newTotal();
		}
		public void displayWaterDay(){
			System.out.println("\n" + day);
			for (int i = 0; i<water.size(); i++)
				System.out.print(water.get(i)+ ", ") ;
		}
		private int newTotal(){
			int newTot = 0;
			for (int i = 0; i<water.size(); i++)
			{
				newTot += Integer.parseInt(water.get(i));	//Use List.get here
			}
			return newTot;
		}
		public void cleanList(){
			for (int i = 0; i < water.size(); i++)
			{
				if (Integer.parseInt(water.get(i)) == 0)
				{
					water.remove(i);						//Use List.Remove
					i--;
				}
			}
		}
	}
	public static void main(String[] args) {
	
		Set<String> week = new HashSet<String>();
		week.add("Monday");
		week.add("Tuesday");
		week.add("Wednesday");
		week.add("Thursday");
		week.add("Friday");
		week.add("Saturday");
		week.add("Sunday");
		week.add("Monday");
		week.add("Tuesday");
		System.out.println(week.size() + " distinct words: " + week);
		
		Map weeeek = new TreeMap();
		weeeek.put("Monday", 1);
		weeeek.put("Tuesday",2);
		weeeek.put("Wednesday",3);
		weeeek.put("Thursday",4);
		weeeek.put("Friday",5);
		weeeek.put("Saturday",6);
		weeeek.put("Sunday",7);
		weeeek.put("Monday",8);
		weeeek.put("Tuesday",9);
		System.out.println(weeeek.size() + " distinct words: " + week);
		//System.out.println(s.size() + " distinct words: " + s)
		
	
		Day day = new Day();
		
		for(int i = 0; i < 7; i++){
			day.drankWater();
		}
		day.displayWaterDay();
		day.cleanList();
		day.displayWaterDay();
		
		//add water from the day to the waterTrackerList
	}

	//Widely used random Int class found on the web
	public static int randomInt(int min, int max) {

	    Random rand = new Random();

	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	private static int getIntFromUser(){
		int number = 0;
		try{
			number = Integer.parseInt(reader.readLine());
		}catch(IOException nfe){
			System.err.println("Invalid Format!");
		}
		return number;
	}
}
