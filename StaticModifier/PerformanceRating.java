package program;

public class PerformanceRating
{
	private static int outstanding;
	private static int good;
	private static int average;
	private static int poor;
	
	static
	{
		outstanding = 5;
		good = 4;
		average = 3;
		poor = 2;
	}
	
	static int calculatePerformance(Employee emp)
	{
		if (emp.getPoints() > 80)
			return outstanding;
		else if (emp.getPoints()>= 60 && emp.getPoints() < 80)
			return good;
		else if (emp.getPoints()>= 50 && emp.getPoints() < 60)
			return average;
		else
			return poor;
	}
}
