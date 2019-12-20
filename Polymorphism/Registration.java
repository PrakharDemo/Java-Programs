
public class Registration 
{
	private String customerName;
	private String passportNo;
	private String panCardNo;
	private int voterId;
	private int licenseNo;
	private long telephoneNo[];
	
	public Registration(String customerName, String passportNo, long[] telephoneNo)
	{
		this.customerName = customerName;
		this.passportNo = passportNo;
		this.telephoneNo = telephoneNo;
	}
	
	public Registration(String customerName, String panCardNo, int licenseNo, long[] telephoneNo) 
	{
		this.customerName = customerName;
		this.panCardNo = panCardNo;
		this.licenseNo = licenseNo;
		this.telephoneNo = telephoneNo;
	}

	public Registration(String customerName, int voterId, int licenseNo, long[] telephoneNo) 
	{
		this.customerName = customerName;
		this.voterId = voterId;
		this.licenseNo = licenseNo;
		this.telephoneNo = telephoneNo;
	}

	public Registration (String customerName, int voterId, String panCardNo, long[] telephoneNo) 
	{
		this.customerName = customerName;
		this.voterId = voterId;
		this.panCardNo = panCardNo;
		this.telephoneNo = telephoneNo;
	}

	public long[] getTelephoneNo() 
	{
		return telephoneNo;
	}

	public String getCustomerName() 
	{
		return customerName;
	}

	public String getPassportNo() 
	{
		return passportNo;
	}

	public String getPanCardNo() 
	{
		return panCardNo;
	}

	public int getVoterId() 
	{
		return voterId;
	}

	public int getLicenseNo() 
	{
		return licenseNo;
	}
}
