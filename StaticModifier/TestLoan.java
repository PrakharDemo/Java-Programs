package staticModifier;

public class TestLoan 
{
	public static void main(String args[])
	{
		System.out.println("\nThe count of loan instances is :" + Loan.getLoanInstance().getNoOfObjects()); 
	}
}
