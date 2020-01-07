package program;

public interface BillComponent 
{
	double tax = 0.12d;
	double extraPersonCharge = 500.0d;
	double foodCharge = 800.0d;
	
	float calculateBillAmount();
}
