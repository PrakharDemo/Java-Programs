
public class RegistrationTester 
{
	public static void main(String[] args) 
	{
		// Creating blank long array to store the returned Phone Number array, from getTelephoneNo() method of Registration class.
		long telephones[] = new long[2];
		
		
		// We are using 4 arrays, to store 4 set of contact numbers.
		long telephones1[] = {9452425421L,7676765252L};
		long telephones2[] = {2345615451L,6763562562L};
		long telephones3[] = {9634524353L,9887373737L};
		long telephones4[] = {9867456367L,7645367356L};
		
		
		Registration reg1 = new Registration ("Kevin", "MN9891N", telephones1);
		
		// Getting the first element of returned array telephones1, into telephones[0]
		telephones[0]=reg1.getTelephoneNo()[0]; 
		
		// Getting the second element of returned array telephones1, into telephones[1].
		telephones[1]=reg1.getTelephoneNo()[1]; 
		
		System.out.println("\nCongratulations " + reg1.getCustomerName() + "!!! you have been successfully registered for our services with following details:");
		System.out.println("\t \t \t Passport number: " + reg1.getPassportNo());
		System.out.println("\t \t \t Phone numbers: " + telephones[0] + "\n \t \t \t \t" + telephones[1]);
		
		
		
		Registration reg2 = new Registration ("Julias", "PN7878", 123, telephones2);
		telephones1[0]=reg2.getTelephoneNo()[0];
		telephones1[1]=reg2.getTelephoneNo()[1];
		System.out.println("\nCongratulations " + reg2.getCustomerName() + "!!! you have been successfully registered for our services with following details:");
		System.out.println("\t \t \tLicence number: " + reg2.getLicenseNo());
		System.out.println("\t \t \tPan card number: " + reg2.getPanCardNo());
		System.out.println("\t \t \t Phone numbers: " + telephones[0] + "\n \t \t \t \t" + telephones[1]);
		
		
		
		Registration reg3 = new Registration ("Jammy", 45453, 765, telephones3);
		telephones1[0]=reg3.getTelephoneNo()[0];
		telephones1[1]=reg3.getTelephoneNo()[1];
		System.out.println("\nCongratulations " + reg3.getCustomerName() + "!!! you have been successfully registered for our services with following details:");
		System.out.println("\t \t \tVoter id: " + reg3.getVoterId());
		System.out.println("\t \t \tLicence number: " + reg3.getLicenseNo());
		System.out.println("\t \t \t Phone numbers: " + telephones[0] + "\n \t \t \t \t" + telephones[1]);
		
		
		
		Registration reg4 = new Registration ("Rose", 34356, "PN8934", telephones4);
		telephones[0]=reg4.getTelephoneNo()[0];
		telephones[1]=reg4.getTelephoneNo()[1];
		System.out.println("\nCongratulations " + reg4.getCustomerName() + "!!! you have been successfully registered for our services with following details:");
		System.out.println("\t \t \tPan card number: " + reg4.getPanCardNo());
		System.out.println("\t \t \tVoter id: " + reg4.getVoterId());
		System.out.println("\t \t \t Phone numbers: " + telephones[0] + "\n \t \t \t \t" + telephones[1]);
	}
}
