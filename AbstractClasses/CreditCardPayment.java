package program;

public class CreditCardPayment extends PaymentServices
{
	private static int counter;
	private String paymentId;
	private double cashBack;
	private double balanceDue;
	
	static
	{
		counter = 1000;
	}
	
	public CreditCardPayment (double balance, int customerId) 
	{
		super(balance, customerId);
	}
    
	public String getPaymentId() 
	{
		return paymentId;
	}

	public double getCashBack() 
	{
		return cashBack;
	}

	public double getBalanceDue() 
	{
		return balanceDue;
	}

	public void payBill (double amount)
	{
		paymentId = "CC"+ ++counter;
		cashBack = amount - balance;
		
		System.out.println("\nCongratulations! You've successfully made a CreditCard payment of Rs. " + amount + ". Payment details are-");
		System.out.println("\tCustomer ID \t\t:\t" + customerId);
		System.out.println("\tPayment ID  \t\t:\t" + paymentId);
		System.out.println("\tPrevious Due\t\t:\tRs." + balance);
		System.out.println("\tBalance Due \t\t:\tRs." + balanceDue);
		if (cashBack >= 0.0)
			System.out.println("\tCashback Wallet Balance : \tRs." + cashBack);
	}
}
