package javaCollections;
import java.util.*;

/**********************************************************
 * 
 * @author Oracle Gods
 * 
 *  Cite: http://docs.oracle.com/javase/tutorial/collections/interfaces/set.html
 *
 * TreeSet is substantially slower than a HashSet,
 * but it orders the elements entered in based on value
 **********************************************************/
public class InternetCollectionSet {
	public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        
        s.add("Long string");
        s.add("zebra");
        s.add("i");
        s.add("came");
        s.add("i");
        s.add("saw");
        s.add("i");
        s.add("left");
        
        System.out.println(s.size() + " distinct words: " + s);
        
    }
}
