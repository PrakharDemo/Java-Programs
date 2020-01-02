package program2;

public class Tester 
{
	public static void main(String[] args) 
	{
		LocationChanger l1 = new LocationChanger();
		l1.setName("Laxmi Tiwari");
		l1.setLocation("BL003,Delhi,STP");
		l1.welcomeEmployee();
		l1.checkCity();
		l1.editAddress();
		
		LocationChanger l2 = new LocationChanger();
		l2.setLocation("FL091,Pune,SEZ");
		l2.setName("Ankur Ranjan");
		l2.welcomeEmployee();
		l2.checkCity();
		l2.editAddress();
		
		LocationChanger l3 = new LocationChanger();
		l3.setName("Amrutha Kalathil");
		l3.setLocation("Block1,Thiruvananthapuram,SEZ");
		l3.welcomeEmployee();
		l3.checkCity();
		l3.editAddress();
		
		LocationChanger l4 = new LocationChanger();
		l4.setName("Anoop Panigrahi");
		l4.setLocation("Building5,Bhubaneshwar,STP");
		l4.welcomeEmployee();
		l4.checkCity();
		l4.editAddress();
	}
}
