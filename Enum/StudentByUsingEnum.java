package program2;

public class StudentByUsingEnum 
{
	private int studentId;
	private String name;
	private Grade grade;
	private int scholarshipAmount;
	private int totalMarks;
	
	public int getStudentId() 
	{
		return studentId;
	}
	
	public void setStudentId(int studentId) 
	{
		this.studentId = studentId;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getScholarshipAmount() 
	{
		return scholarshipAmount;
	}
	
	public void setScholarshipAmount(int scholarshipAmount) 
	{
		this.scholarshipAmount = scholarshipAmount;
	}
	
	public int getTotalMarks() 
	{
		return totalMarks;
	}
	
	public void setTotalMarks(int totalMarks) 
	{
		this.totalMarks = totalMarks;
	}
	
	public void calculateGrade()
	{
		if (totalMarks >= 250)
			grade = Grade.A;
		else if (totalMarks >= 200 && totalMarks < 250)
			grade = Grade.A;
		else if (totalMarks >= 175 && totalMarks < 200)
			grade = Grade.C;
		else if (totalMarks >= 150 && totalMarks < 175)
			grade = Grade.D;
		else 
			grade = Grade.E;
	}
	
	public void calculateScholarshipAmount()
	{
		if (grade == Grade.A)
			scholarshipAmount = 5000;
		else if (grade == Grade.B)
			scholarshipAmount = 4000;
		else if (grade == Grade.C)
			scholarshipAmount = 3000;
		else if (grade == Grade.D)
			scholarshipAmount = 2000;
		else
			scholarshipAmount = 0;
	}
	
}


