
public class VehicleLoan extends Loan
{
	private int additionalTax = 200;
	
	public double calculateEMI (double principal)
	{
        double simpleInterest = (principal * 9.5 * 10) / 100;
        double emi = (simpleInterest + principal) / 10;
        return emi+additionalTax;
    }
}
