package Converting_Concept;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List_to_Set {

	public static void main(String[] args) {
			
	String list[] = {"List to convert Set Concept"};
	 
     List<String> L	=Arrays.asList(list);

	System.out.println("List =" + L);
	
	Set<String> S = new HashSet <String> (L);
	
	
	System.out.println("list ( converted to  Set) =" + S);
}
}