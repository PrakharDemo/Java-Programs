
public class TeamEventRegistration extends EventRegistration
{
	private int noOfParticipants;
	private int teamNo;
	
	public TeamEventRegistration(String name, String nameOfEvent, int noOfParticipants, int teamNo)
	{
		super(name, nameOfEvent);
		this.noOfParticipants = noOfParticipants;
		this.teamNo = teamNo;
	}
	
	public int getTeamNo()
	{
		return teamNo;
	}
	
	public void setTeamNo(int teamNo)
	{
		this.teamNo = teamNo;
	}
	
	public int getnoOfParticipants()
	{
		return noOfParticipants;
	}
	
	public void setNoOfParticipants(int noOfParticipants)
	{
		this.noOfParticipants = noOfParticipants; 
	}
	
	public void registerEvent()
	{
		double baseFee = 0.0d;
		if ((nameOfEvent != "ShakeALeg") && (nameOfEvent != "Sing&Win") && (nameOfEvent != "PlayAway") && (nameOfEvent != "Actathon"))
		{
			System.out.println("\nPlease choose a valid event name");
			System.exit(0);
		}
		else if (nameOfEvent == "ShakeALeg")
			baseFee = 50.0d;
		else if (nameOfEvent == "Sing&Win")
			baseFee = 60.0d;
		else if (nameOfEvent == "Actathon")
			baseFee = 80.0d;
		else if (nameOfEvent == "PlayAway")
			baseFee = 100.0d;
		
		registrationFee = baseFee * noOfParticipants;
	}
}
