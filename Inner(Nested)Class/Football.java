package program2;

public class Football 
{
	private String leagueName;
	private String coachName;
	
	public void setLeagueName(String leagueName) 
	{
		this.leagueName = leagueName;
	}

	public void setCoachName(String coachName) 
	{
		this.coachName = coachName;
	}

	private class Player
	{
		private String playerName;
		private long phoneNumber;
		
		private void DisplayLeagueDetails()
		{
			Football football1 = new Football();
			football1.setCoachName("Jose Mourinho");
			football1.setLeagueName("BundesLiga");
			
			Football football2 = new Football();
			football2.setCoachName("Alex Fergusson");
			football2.setLeagueName("LaLiga");
			
			System.out.println("***************************************");
			System.out.println("\n\tLeague 1 Details - \t");
			System.out.println("Coach \t: " + football1.coachName);
			System.out.println("League \t: " + football1.leagueName);
			System.out.println("***************************************");
			
			System.out.println("***************************************");
			System.out.println("\n\tLeague 2 Details - \t");
			System.out.println("Coach \t: " + football2.coachName);
			System.out.println("League \t: " + football2.leagueName);
			System.out.println("***************************************");
		}
	}
	
	public void DisplayPlayerDetails()
	{
		Player player = new Player();
		player.phoneNumber = 9538355169l;
		player.playerName = "Peter";
		
		System.out.println("***************************************");
		System.out.println("\n\tPlayer Details - \t");
		System.out.println("Player Name is : " + player.playerName);
		System.out.println("Player Contact : " + player.phoneNumber);
		System.out.println("***************************************");
		
		Player p = new Player();
		p.DisplayLeagueDetails();
	}
}
