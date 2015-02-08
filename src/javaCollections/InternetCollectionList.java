package javaCollections;
import java.util.*;

/************************************************************
 * 
 * @author java Tutorials online
 * Site: http://docs.oracle.com/javase/tutorial/collections/interfaces/list.html
 * 
 * Can contain duplicate elements
 ************************************************************/
public class InternetCollectionList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Mary");
		list.add("Sue");
		list.add("Joe");
		list.add("Doug");
		list.add("Chuck");
		list.add("Hope");
		list.add("Mary");
		list.add("Jack");
		
		for (String a : args)
			list.add(a);
		Collections.shuffle(list, new Random());
		System.out.println(list);
	}
}
