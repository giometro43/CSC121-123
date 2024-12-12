import java.util.*;
public class num3 {
	public static void main(String[] args) {
	Scanner userinput =new Scanner(System.in);
	/*
	 Write a program that asks the user to enter the number 5. 
	 Make sure to validate the User's input. If it is incorrect, the User should be given an 
	 infinite number of attempts to reenter the number. The program should then display a triangle 
	 on the screen using the character ‘X’. The number entered by the User (5) will be the length 
	 of the right and left sides of the triangle (not the base). The program should display the following:

    1        X
    3       X X
    5      X   X
 	7  	  X     X
	9	 XXXXXXXXX
		The triangle doesn't have to be perfect but each side should have the correct number of X's. 
		Hint: Is there a pattern you can find as you move from one line to the next?
		Note: Your program must use at least two loops to receive credit.
	*/
	int inputval;    //initialization
	boolean a = true;
	while (a) {
        System.out.print("Enter the number 5: ");
        if (userinput.hasNextInt()) {
            inputval = userinput.nextInt();
            
            if (inputval == 5) {
            	a = false;
            	System.out.println("Thank you for entering the correct data type and value.");
            	switch(inputval) {
            	case 5:
            	System.out.println("    X");
            	inputval=inputval+1;
            	case 6:
            	System.out.println("   X X");
            	case 7:
            	System.out.println("  X   X");
            	case 8:
               	System.out.println(" X     X");
            	case 9:
            	System.out.println("XXXXXXXXX");
            	case 10:
            	break;
            	}
            }
           //this is the correct input validation
        } 
        else {
            System.out.println("Invalid! Please enter an integer value of 5.");
            userinput.next(); 
        }
      
       
    }
    
    				
    				
    	
    	
    	
}			
}		

