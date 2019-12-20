
public class HomeLoan extends Loan
{
	 private int additionalTax = 200;
	 
	 public double calculateEMI (double principal)
	 {
	        double simpleInterest = (principal * 7.5 * 20) / 100;
	        double emi = (simpleInterest + principal) / 20;
	        return emi+additionalTax;
	 }
}
