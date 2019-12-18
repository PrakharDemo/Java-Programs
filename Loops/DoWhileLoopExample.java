
import java.util.Scanner;
public class DoWhileLoopExample 
{
	public static void main(String[] args) 
	{
	    // This program displays the sum of digits of a number, using the do-While loop
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number whose sum of digits is required :");
		int number = input.nextInt();
		int copy = number;
		int i, sum = 0;
		do
		{
			i = number%10;
			sum += i;
			number=number/10;
		}
		while (number >0);
		System.out.println("The sum of digits of the number " + copy + " is : " + sum);
		input.close();
	}

}
