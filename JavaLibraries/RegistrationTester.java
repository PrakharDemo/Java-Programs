package program;

public class RegistrationTester 
{
	public static void main (String[] args) 
	{
		// Creating the first student object
		StudentRegistration s1 = new StudentRegistration ("Peter", 23, 5001);
				
		
		// Creating more student objects & verifying if they have been registered previously or not
		StudentRegistration s2 = new StudentRegistration ("Rambo", 24, 5003);
		s1.equals(s2);
				
		StudentRegistration s3 = new StudentRegistration ("Peter", 23, 5001);
		s1.equals(s3);
		// This should return false, as the student Peter, with the same details has already been registered.
		
		StudentRegistration s4 = new StudentRegistration ("Chacko", 26, 5002);
		s1.equals(s4);
	}
}
