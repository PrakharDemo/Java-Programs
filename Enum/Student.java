package program;

public class Student 
{
	private int studentId;
	private String name;
	private char grade;
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
	
	public char getGrade() 
	{
		return grade;
	}
	
	public void setGrade(char grade) 
	{
		this.grade = grade;
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

	public void calculateScholarshipAmount()
	{
		if (grade == 'A')
			scholarshipAmount = 5000;
		else if (grade == 'B')
			scholarshipAmount = 4000;
		else if (grade == 'C')
			scholarshipAmount = 3000;
		else if (grade == 'D')
			scholarshipAmount = 2000;
		else
			scholarshipAmount = 0;
	}
	
	public void calculateGrade()
	{
		if (totalMarks >= 250)
			grade = 'A';
		else if (totalMarks >= 200 && totalMarks < 250)
			grade = 'B';
		else if (totalMarks >= 175 && totalMarks < 200)
			grade = 'C';
		else if (totalMarks >= 150 && totalMarks < 175)
			grade = 'D';
		else
			grade = 'E';
	}
}
