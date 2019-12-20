
public class RatingTester 
{
	public static void main(String[] args)
	{
		PlayerRating pTwoCritics = new PlayerRating ();
		PlayerRating pThreeCritics = new PlayerRating ();
		
		pTwoCritics.setPlayerName("Beckham");
		pTwoCritics.setPlayerPosition(1);
		pTwoCritics.CalculateAverageRating(9f, 9.9f);
		pTwoCritics.CalculateCategory();
		pTwoCritics.Display();
		
		pThreeCritics.setPlayerName("Oscar");
		pThreeCritics.setPlayerPosition(1);
		pThreeCritics.CalculateAverageRating(1f, 1f, 1f);
		pThreeCritics.CalculateCategory();
		pThreeCritics.Display();
	}
}
