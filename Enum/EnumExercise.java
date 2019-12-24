package program;

public class EnumExercise 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.setStudentId(1000);
		s1.setName("Alvin");
		s1.setTotalMarks(150);
		s1.calculateGrade();
		s1.calculateScholarshipAmount();
		
		System.out.println("\n\tStudent Details");
		System.out.println("Student ID \t : \t" + s1.getStudentId());
		System.out.println("Student Name \t : \t" + s1.getName());
		System.out.println("Student Grade \t : \t" + s1.getGrade());
		System.out.println("Scholarship Amount : \t" + s1.getScholarshipAmount());
	}
}
