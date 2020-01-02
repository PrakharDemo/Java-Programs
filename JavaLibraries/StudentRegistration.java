package program;

public class StudentRegistration 
{
	private String studentName;
	private double age;
	private int admissionNumber;
	private int rollNumber;
	private static int counter;
	
	static
	{
		counter = 1001;
	}
	
	public StudentRegistration(String studentName, double age, int admissionNumber) 
	{
		this.studentName = studentName;
		this.age = age;
		this.admissionNumber = admissionNumber;
	}

	public String getStudentName() 
	{
		return studentName;
	}
	
	public double getAge() 
	{
		return age;
	}
	
	public int getAdmissionNumber() 
	{
		return admissionNumber;
	}
	
	public int getRollNumber() 
	{
		return rollNumber;
	}
	
	public void generateRollNumber()
	{
		rollNumber = ++counter;
	}
	
	public int hashCode()
	{
		// Here, we can return any integer value.
		
		return this.admissionNumber;
	}
	
	public boolean equals (Object obj)
	{
		if (obj == null || obj.getClass() != this.getClass())
			return false;
		
		else if (this.hashCode() == obj.hashCode())
		{
			System.out.println("\nRoll number already generated for the student " + this.studentName + "!\n");
			return false;
		}
		
		else
		{
			StudentRegistration s = (StudentRegistration) obj;
			s.generateRollNumber();
			System.out.println("\n*************** Student Details *****************");
			System.out.println("Student Name\t\t :\t" +s.studentName);
			System.out.println("Admission Number\t : \t" + s.admissionNumber);
			System.out.println("Roll Number \t\t : \t" + s.rollNumber);
			System.out.println("Age of Student\t\t: \t" + s.age);
			System.out.println("\n*************************************************");
			return true;
		}
	}
	
	
	

}
