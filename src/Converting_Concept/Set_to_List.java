package Converting_Concept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_to_List {

	public static void main(String[] args) {
		
		Set<Integer> S = new HashSet<Integer>();
	S.add(20);
	S.add(56);
	S.add(75);
	S.add(85);
	S.add(10);
	
	System.out.println("Set =" + S);
	
	List<Integer> L = new ArrayList<Integer>(S);
	
	System.out.println("List=" + L);
	
	
	
	
	
	
	
	}
}
