import java.util.*;
public class Q1 {
	/* A bank charges a base fee of $10 per month, 
	 * plus the following check fees for a commercial checking account:
		$.10 each for less than 20 checks
		$.08 each for 20–39 checks
		$.06 each for 40–59 checks
		$.04 each for 60 or more checks
	Write a program that asks for the number of checks written for the month. 
	The program should then calculate and display the bank’s 
	service fees for the month.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner userinput = new Scanner(System.in);
	System.out.print("Please enter the number of checks used this month");
	int checks = userinput.nextInt();
	int monthlyFee = 10;
	double cost;
		switch (checks/20)
		{
		case 0:
			cost = 0.10;
		break;
		//since anything less than 20, divided by 20 gives a 0.etcc value it would
		//go to case 0. same applies for the other cases
		case 1:
			cost = 0.08;
		break;
		
		case 2:
			cost = 0.06;
		break;
		
		default:
			cost = 0.04;
		break;
		}
		double total = monthlyFee + (checks * cost);
		
		System.out.printf("Total banking cost this month with " + checks +
		" checks brings the total fees to $%.2f%n", total);
	}	
}


