package program;

public class Tester 
{
	public static void main(String[] args) 
	{
		Trainee t1 = new Trainee (6000);
		t1.calcPercentage();
		
		Trainee t2 = new Trainee (9000);
		t2.calcPercentage();
		
		Intern i1 = new Intern (5000, 500);
		i1.calcPercentage();
		
		Intern i2 = new Intern (8000, 500);
		i2.calcPercentage();
	}
}
