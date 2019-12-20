
public class EventRegistration 
{
	protected String name;
	protected String nameOfEvent;
	protected double registrationFee;
	
	public EventRegistration(String name, String nameOfEvent) 
	{
		this.name = name;
		this.nameOfEvent = nameOfEvent;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getNameOfEvent() 
	{
		return nameOfEvent;
	}
	
	public void setNameOfEvent(String nameOfEvent) 
	{
		this.nameOfEvent = nameOfEvent;
	}
	
	public double getRegistrationFee() 
	{
		return registrationFee;
	}
	
	public void setRegistrationFee(double registrationFee) 
	{
		this.registrationFee = registrationFee;
	}
	
	public void registerEvent()
	{
		if ((nameOfEvent != "ShakeALeg") && (nameOfEvent != "Sing&Win") && (nameOfEvent != "PlayAway"))
		{
			System.out.println("\nPlease choose a valid event name");
			System.exit(0);
		}
		else if (nameOfEvent == "ShakeALeg")
			registrationFee = 100.0d;
		else if (nameOfEvent == "Sing&Win")
			registrationFee = 150.0d;
		else if (nameOfEvent == "Actathon")
			registrationFee = 70.0d;
		else if (nameOfEvent == "PlayAway")
			registrationFee = 130.0d;
	}
}
