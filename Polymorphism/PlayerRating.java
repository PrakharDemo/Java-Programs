
public class PlayerRating 
{
	private int playerPosition;
	private String playerName;
	private float criticOneRating;
	private float criticTwoRating;
	private float criticThreeRating;
	private float averageRating;
	private char category;
	
	public void setPlayerPosition(int playerPosition) 
	{
		this.playerPosition = playerPosition;
	}

	public void setPlayerName(String playerName) 
	{
		this.playerName = playerName;
	}

	public void setCriticOneRating(float criticOneRating) 
	{
		this.criticOneRating = criticOneRating;
	}

	public void setCriticTwoRating(float criticTwoRating)
	{
		this.criticTwoRating = criticTwoRating;
	}

	public void setCriticThreeRating(float criticThreeRating) 
	{
		this.criticThreeRating = criticThreeRating;
	}

	public void CalculateAverageRating (float criticOneRating, float criticTwoRating)
	{
		averageRating = (criticOneRating + criticTwoRating)/2;
	}

	public void CalculateAverageRating (float criticOneRating, float criticTwoRating, float criticThreeRating)
	{
		averageRating = (criticOneRating + criticTwoRating + criticThreeRating)/3;
	}
	
	public void CalculateCategory()
	{
		if (averageRating > 8)
			category = 'A';
		else if (averageRating > 5 && averageRating <= 8)
			category = 'B';
		else if (averageRating > 0 && averageRating <= 5)
			category = 'C';
		else
			category = ' ';
	}
	
	public void Display()
	{
		System.out.println("\nPlayer Name\t---> " + playerName);
		System.out.println("Player Position ---> " + playerPosition);
		System.out.println("Average Rating  ---> " + averageRating);
		System.out.println("The Category is ---> " + category);
	}
}
