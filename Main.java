
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   
	    
	    StarShip[] ssInput = new StarShip[1];
	    ssInput[0]= new XWing(200.2, "Patrol X-Wing");
	    
	    for (StarShip s1 : ssInput) {
	    	System.out.println(s1.toString());
	    }
	    }
}



/*
 * Finally, write a driver class named Main that creates a polymorphic 
 * reference variable from the StarShip class that stores an XWing object 
 * and calls the toString() method to print the model of the XWing. (5 points)
 */
