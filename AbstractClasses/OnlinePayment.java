package program;

public class OnlinePayment extends PaymentServices 
{
	private static int counter;
	private String paymentId;
	
	static
	{
		counter = 5000;
	}
	
	public OnlinePayment(double balance, int customerId) 
	{
		super(balance, customerId);
	}
	
	public String getPaymentId() 
	{
		return paymentId;
	}

	public void setPaymentId (String paymentId) 
	{
		this.paymentId = paymentId;
	}

	public void payBill (double amount) 
	{
		if (amount < balance)
			System.out.println("\nInsufficient amount entered ! Please pay the entire bill amount.");
		
		else if (amount > balance)
			System.out.println("\nExcess amount has been entered ! Please try again.");
		
		else
		{
			paymentId = "OL" + ++counter;
			System.out.println("\nCongratulations! You've successfully made an Online payment of Rs. " + amount + ". Payment details are-");
			System.out.println("\tCustomer ID :\t\t" + customerId);
			System.out.println("\tPayment ID  :\t\t" + paymentId);
		}
	}
}
