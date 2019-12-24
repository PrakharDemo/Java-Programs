package program;

public abstract class PaymentServices 
{
	protected double balance;
	protected int customerId;
	
	public double getBalance() 
	{
		return balance;
	}
	
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	
	public int getCustomerId() 
	{
		return customerId;
	}
	
	public void setCustomerId(int customerId) 
	{
		this.customerId = customerId;
	}

	
	public PaymentServices(double balance, int customerId) 
	{
		this.balance = balance;
		this.customerId = customerId;
	}
	
	public abstract void payBill (double amount);
	
}
