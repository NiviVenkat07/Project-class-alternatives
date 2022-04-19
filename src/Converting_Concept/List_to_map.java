package Converting_Concept;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class List_to_map {

	public static void main(String[] args) {
		
	Map<Integer,String> M = new HashMap<Integer,String>();
	M.put(1, "one");
	M.put(2, "Two");
	M.put(3, "Three");
	M.put(4, "Four");
	M.put(5, "Five");
	
	System.out.println(M);
	
	Set<Integer> s =M.keySet();
	System.out.println(s);
	
	Collection<String> c =M.values();
	System.out.println(c);
	
    Set<Entry<Integer,String>> E =  M.entrySet();
	for (Entry<Integer, String> e : E) {
		
		System.out.println(e.getKey());
	    System.out.println(e.getValue());
	    
	
		
		
	}	
}
}