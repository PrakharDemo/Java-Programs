package program;

public class Intern implements DataProvider 
{
	private int marksSecured;
	private int graceMarks;
	
	public Intern(int marksSecured, int graceMarks) 
	{
		this.marksSecured = marksSecured;
		this.graceMarks = graceMarks;
	}

	public void calcPercentage() 
	{
		if (marksSecured >= totalMaximumMarks)
			{
				System.out.println("\nPlease enter correct data for Marks");
				// System.exit(0);
			}
		else
		{
			double percentage = 0;
			percentage = (graceMarks + marksSecured)*100/totalMaximumMarks;
			System.out.println("\nThe aggregate percentage secured is : " + percentage);
		}
			
	}
}
