package program;

public class PerformanceCalculator 
{

	public static void main(String[] args) 
	{
		PerformanceRating p = new PerformanceRating();
		
		Employee emp1 = new Employee();
		emp1.setPoints(76);
		System.out.println("The rating of 1st employee is : " + p.calculatePerformance(emp1)); 
		
		Employee emp2 = new Employee();
		emp2.setPoints(99);
		System.out.println("The rating of 2nd employee is : " + p.calculatePerformance(emp2));
		
		Employee emp3 = new Employee();
		emp3.setPoints(30);
		System.out.println("The rating of 3rd employee is : " + p.calculatePerformance(emp3));
		
		Employee emp4 = new Employee();
		emp4.setPoints(55);
		System.out.println("The rating of 4th employee is : " + p.calculatePerformance(emp4));
	}

}
