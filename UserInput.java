
import java.util.Scanner;

public class UserInput 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		// Getting a float value as an input
		System.out.println("Please enter a decimal value as input :");
		float myFloat = input.nextFloat();
		System.out.println("The entered float value is : " + myFloat);

		// Getting a double value as an input
    		System.out.print("Please enter a double value as input :");
    		double myDouble = input.nextDouble();
    		System.out.println("The entered Double value is : " + myDouble);
    	
    		// Getting String input
    		System.out.print("Please enter a text value as input: ");
    		String myString = input.next();
    		System.out.println("The entered text is " + myString);
		
		input.close();
	}

}
