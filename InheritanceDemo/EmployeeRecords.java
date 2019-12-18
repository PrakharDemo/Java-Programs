
public class EmployeeRecords 
{
	public static void main(String[] args) 
	{
		ContractualEmployee contract1 = new ContractualEmployee();
		PermanentEmployee perm1 = new PermanentEmployee();
		
		contract1.setName("Ankit");
		contract1.setEmpId(102);
		contract1.setWages(500);
		contract1.setHours(10);
		contract1.CalculateSalary();
		
		System.out.println("\nContractual Employee ---> Your Salary is : " + contract1.getSalary() + "\n");
		
		
		perm1.setName("Anil");
		perm1.setEmpId(101);
		perm1.setBasicPay(10000);
		perm1.setHra(1500);
		perm1.setExperience(3);
		perm1.CalculateSalary();
		
		System.out.println("Permanent Employee ---> Your Salary is : " + perm1.getSalary());
	}

}
