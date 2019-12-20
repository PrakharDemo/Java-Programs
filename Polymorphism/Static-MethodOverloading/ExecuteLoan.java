
public class ExecuteLoan 
{
	public static void main(String[] args) 
	{
		Loan loan = new HomeLoan();
        double hloan = loan.calculateEMI(2000000);
        
        loan = new VehicleLoan();
        double vloan = loan.calculateEMI(100000);
        
        System.out.println("\nHome Loan EMI per year is..." + hloan);
        System.out.println("\nVehicle Loan EMI per year is..." + vloan);
	}
}
