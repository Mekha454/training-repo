package regular;

public class SwitchStatements {
	
	

	public static void main(String[] args) {
		char value = 'F';
	
	switch(value) {
	  case 'A': 
		  System.out.println("Case A matches!"); 
		  break; // break is REQUIRED, unless you want control flow to "fall through" to the next case
	  case 'B': 
		  System.out.println("Case B matches!"); 
		  break;
	  case 'C': 
		  System.out.println("Case C matches!"); 
		  break;
	  default: 
		  System.out.println("this will run if other cases don't match"); 
		  break;
	}

}
}
