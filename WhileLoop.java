
public class WhileLoop 
{
	public static void main(String[] args) 
	{
		int i = 0;
		while (i < 100)
		{
			if (i%2 ==0)
				System.out.println("The number " + i + " is an Even number");
			else
				System.out.println("The number " + i + " is an Odd number");
			
			i++;
		}
	}
}
