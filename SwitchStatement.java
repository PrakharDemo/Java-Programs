
import java.util.Scanner;

public class SwitchStatement
{
	public static void main(String[] args)
	{
		// This program demonstrates the Switch statement. 
		// It returns the name of the day, when you enter the number of day of the week.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number, between 0 & 6, for the day of the week");
		System.out.println("Please note that 0th day implies Sunday, 1st day implies Monday, and so on...");
		int value = input.nextInt();
		
		switch(value)
		{
			case 0:
				System.out.println("Yay -- It is Sunday !! ");
				break;
				
			case 1:
				System.out.println("Off -- It is Monday, Again :( !! ");
				break;
			
			case 2:
				System.out.println("It is Tuesday !! ");
				break;
				
			case 3:
				System.out.println("It is Wednesday !! ");
				break;
				
			case 4:
				System.out.println("It is Thursday !! ");
				break;
				
			case 5:
				System.out.println("Yay, It is Friday !! ");
				break;
				
			case 6:
				System.out.println("Yay, It is Saturday !! ");
				break;
				
			default:
				System.out.println("The entered value is not valid");
		}
		input.close();
	}
}
