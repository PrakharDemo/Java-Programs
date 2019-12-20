package staticModifier;

public class Loan 
{
	private int loanNo;
	private int accountNo;
	private int customerNo;
	private int loanDuration;
	private float interest;
	private float loanAmount;
	
	private static int loanCounter;
	
	static
	{
		loanCounter = 101;
	}
	
	private Loan() 
	{
		loanCounter++;
	}

	
	private Loan(int loanNo, int accountNo, int customerNo, int loanDuration, float interest, float loanAmount) 
	{
		this.loanNo = loanNo;
		this.accountNo = accountNo;
		this.customerNo = customerNo;
		this.loanDuration = loanDuration;
		this.interest = interest;
		this.loanAmount = loanAmount;
		loanCounter++;
	}


	
	public int getLoanNo() 
	{
		return loanNo;
	}
	


	public void setLoanNo(int loanNo) 
	{
		this.loanNo = loanNo;
	}
	


	public int getAccountNo()
	{
		return accountNo;
	}
	


	public void setAccountNo(int accountNo) 
	{
		this.accountNo = accountNo;
	}
	


	public int getCustomerNo() 
	{
		return customerNo;
	}
	


	
	public void setCustomerNo(int customerNo) 
	{
		this.customerNo = customerNo;
	}
	


	public int getLoanDuration() 
	{
		return loanDuration;
	}


	
	public void setLoanDuration(int loanDuration) 
	{
		this.loanDuration = loanDuration;
	}
	


	public float getInterest() 
	{
		return interest;
	}


	
	public void setInterest(float interest)
	{
		this.interest = interest;
	}
	


	public float getLoanAmount() 
	{
		return loanAmount;
	}
	


	public void setLoanAmount(float loanAmount) 
	{
		this.loanAmount = loanAmount;
	}
	
	public static Loan getLoanInstance()
	{
		Loan l1 = new Loan();
		Loan l2 = new Loan();
		Loan l3 = new Loan();
		
		Loan l4 = new Loan(12345, 101, 1, 5, 6.0f, 10000.0f);
		Loan l5 = new Loan(12346, 102, 2, 6, 7.0f, 20000.0f);
		Loan l6 = new Loan(12347, 103, 3, 7, 8.0f, 30000.0f);

		Loan l7 = new Loan();
		
		return l7;
	}
	
	public int getNoOfObjects()
	{
		return loanCounter;
	}
}
