
public class Switch {

	private	int numero; 
	
	public static String between(int i) {
		switch(i) {
		  case 1:
		    System.out.println("è uno");
		    break;
		  case 2:
			  System.out.println("è due");
		  case 3:
			  System.out.println("è tre");
		    break;
		  default:
			  System.out.println("sei un mona");
		}
		return null;
		
	}
			
}
