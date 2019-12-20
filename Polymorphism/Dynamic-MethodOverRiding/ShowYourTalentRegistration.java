
public class ShowYourTalentRegistration 
{
	public static void main(String[] args) 
	{
		SingleEventRegistration single1 = new SingleEventRegistration("Jenny", "Sing&Win", 1); 
		single1.registerEvent();
		System.out.println("\nThank You " + single1.getName() + " for your participation. Your registration fee is: " + single1.getRegistrationFee());
		System.out.println("You are participant no: " + single1.getParticipantNo());
		
		
		SingleEventRegistration single2 = new SingleEventRegistration("Hudson", "PlayAway", 2);
		single2.registerEvent();
		System.out.println("\nThank You " + single2.getName() + " for your participation. Your registration fee is: " + single2.getRegistrationFee());
		System.out.println("You are participant no: " + single2.getParticipantNo());
		
		
		TeamEventRegistration team1 = new TeamEventRegistration("Aura", "ShakeALeg", 5, 1);
		team1.registerEvent();
		System.out.println("\nThank You Team " + team1.getName() + " for your participation. Your registration fee is: " + team1.getRegistrationFee());
		System.out.println("You are team no: " + team1.getTeamNo() + " comprising " + team1.getnoOfParticipants() + " participants");
		
		
		TeamEventRegistration team2 = new TeamEventRegistration("Inferno", "RoboWars", 3, 2);
		team2.registerEvent();
		System.out.println("\nThank You Team " + team2.getName() + " for your participation. Your registration fee is: " + team2.getRegistrationFee());
		System.out.println("You are team no: " + team2.getTeamNo() + " comprising " + team2.getnoOfParticipants() + " participants");
		
		
	}

}
