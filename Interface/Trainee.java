package program;

public class Trainee implements DataProvider
{
	private int marksSecured;
	
	public Trainee(int marksSecured) 
	{
		this.marksSecured = marksSecured;
	}

	public void calcPercentage()
	{
		if (marksSecured > totalMaximumMarks)
			{
				System.out.println("\nPlease enter correct data for Marks");
				// System.exit(0);
			}
		else
		{
			double percentage = 0;
			percentage = marksSecured*100/totalMaximumMarks;
			System.out.println("\nThe aggregate percentage secured is : " + percentage);
		}
	}
}
