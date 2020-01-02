package program2;

public class LocationChanger 
{
	private String location;
	private String name;
	
	public String getLocation() 
	{
		return location;
	}
	
	public void setLocation(String location) 
	{
		this.location = location;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public void checkCity()
	{
		// Here, employees from 3 cities - Delhi, Bhubaneshwar & Thiruvananthapuram have moved to Mysore.
		
		String cityFromLocation[] = location.split(",");
		
		String city = cityFromLocation[1]; 
		
		switch (city)
		{
			case "Delhi":
				System.out.println("\nHello Delhiite, Welcome to MyInfy !!");
				break;
				
			case "Bhubaneshwar":
				System.out.println("\nHello InfyBBSRian, Welcome to MyInfy !!");
				break;
		
			case "Thiruvananthapuram":
				System.out.println("\nHello TriInfian, Welcome to MyInfy !!");
				break;
				
			default:
				System.out.println("\nOh oh !! Your city is not listed !");
		}
	}
	
	public void editAddress()
	{
		String siteFromLocation[] = location.split(",");
		
		String site = siteFromLocation[2]; 
		
		if (site.equals("STP"))
			System.out.println("Your location has been changed from STP to SEZ");
		else if (site.equals("SEZ"))
			System.out.println("Your location remains the same - SEZ");
	}
	
	public void welcomeEmployee()
	{
		String firstNameFromName[] = name.split(" ");
		System.out.println("\n\nHey " + firstNameFromName[0] + "....."); 
	}
}
