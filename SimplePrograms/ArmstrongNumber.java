import java.util.Scanner;
public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		System.out.println("This program checks if a number is an Armstrong number");
		System.out.println("Please enter a number");
		long number = input.nextLong();
		long copy = number;
		int rem=0, count=0, sum=0;
		while (copy>0)
		{
			rem = (int)copy%10;
			sum = sum + (rem*rem*rem);
			copy/=10;
		}
		if (sum==number)
			System.out.println(number + " is an Armstrong number");
		else
			System.out.println(number + " is not an Armstrong number");
		
		input.close();
	}
}
