package Converting_Concept;

public class int_to_String {

	public static void main(String[] args) {
		
		int a = 50;
		
		String valueof = String.valueOf(a);
		
		System.out.println(valueof);
		  
	  int i=200;
	  
	   String s=Integer.toString(i);
	   
	    System.out.println(i+100);   //300 because + is binary plus operator.
	    
	    System.out.println(s+100);    //200100 because + is string concatenation operator.
	
	
}
}