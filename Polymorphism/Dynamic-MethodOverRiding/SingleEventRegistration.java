
public class SingleEventRegistration extends EventRegistration
{
	private int participantNo;

	public SingleEventRegistration (String name, String nameOfEvent, int participantNo) 
	{
		super(name, nameOfEvent);
		this.participantNo = participantNo;
	}

	
	public int getParticipantNo() 
	{
		return participantNo;
	}
	

	public void setParticipantNo(int participantNo) 
	{
		this.participantNo = participantNo;
	}

	public void registerEvent()
	{
// 		Switch can also be used as shown below, but it cannot be implemented in case an Invalid Event name is entered. 		
		
//		switch (nameOfEvent)
//		{
//			case "ShakeALeg":
//				registrationFee = 100.0d;
//				break;
//				
//			case "Sing&Win":
//				registrationFee = 150.0d;
//				break;
//				
//			case "PlayAway":
//				registrationFee = 130.0d;
//				break;
//				
//			default:
//				System.out.println("\nPlease choose a valid event name");
//		}
		
		if ((nameOfEvent != "ShakeALeg") && (nameOfEvent != "Sing&Win") && (nameOfEvent != "PlayAway"))
		{
			System.out.println("\nPlease choose a valid event name");
			System.exit(0);
		}
		else if (nameOfEvent == "ShakeALeg")
			registrationFee = 100.0d;
		else if (nameOfEvent == "Sing&Win")
			registrationFee = 150.0d;
		else if (nameOfEvent == "PlayAway")
			registrationFee = 130.0d;
	}
}
